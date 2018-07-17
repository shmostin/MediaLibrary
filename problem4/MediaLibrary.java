

package edu.neu.ccs.cs5004.problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class MediaLibrary implements InterfaceLibrary {
protected Set<ABSMedia> elements;


  public MediaLibrary(Set<ABSMedia> elements) {
    this.elements = elements;
  }



  @Override
  public ArrayList<ABSMedia> directorsWork(String first, String last) throws NoMediaException{
    //the list of media the director has worked on.
    ArrayList<ABSMedia> directorsWork = new ArrayList<ABSMedia>();

    //the iterator for the library
    Iterator<ABSMedia> library = this.elements.iterator();

    //a while loop to iterate over the media in the library
    while (library.hasNext()) {
      ABSMedia current = library.next();
      //a for each loop to iterate through the list of directors of each media
      for (Director aDirector : current.getDirector()) {
        //if the first and last name matches any in the list of directors, add the media to the returnable list
        if (aDirector.name.getFirst().equals(first) && aDirector.name.getLast().equals(last)) {
          directorsWork.add(current);
        }
      }
    }
    if (directorsWork.size() == 0) {
      throw new NoMediaException("This director does not currently have any media in our library.");
    }

    Collections.sort(directorsWork, Collections.reverseOrder());
    for (ABSMedia media : directorsWork) {
      System.out .println(media.getTitle());
    }
    return directorsWork;
  }

  @Override
  public void addMedia(ABSMedia newMedia) throws DuplicateAliasException {
    //check to see if any of the media in the set already has the same alias
    Iterator<ABSMedia> library = this.elements.iterator();
    //while loop to iterate through the library
    while(library.hasNext()) {
      ABSMedia current = library.next();
      //if the alias of any media in the library match this, throw exception

      if (current.getAlias().equals(newMedia.getAlias())) {
        throw new DuplicateAliasException("At least one media in the library already has that Alias.");
      }
    }
    this.elements.add(newMedia);
  }

  @Override
  public void updateStreaming(String alias) {
    Iterator<ABSMedia> library = this.elements.iterator();

    while(library.hasNext()) {
      ABSMedia current = library.next();
      if (current.getAlias().equals(alias)) {
        current.streamCount++;
      }
    }
  }

  @Override
  public Integer timesStreamed(String alias) throws NoMediaException {
    Iterator<ABSMedia> library = this.elements.iterator();
    Integer count = null;

    while (library.hasNext()) {
      ABSMedia current = library.next();
      if (current.getAlias().equals(alias)) {
        count = current.getStreamCount();
      }
    }
    if (count == null) {
      throw new NoMediaException("The given alias was not found in our library.");
    } else {
      return count;
    }
  }

  @Override
  public ABSMedia mostStreamed() {
    Iterator<ABSMedia> library = this.elements.iterator();
    Integer streamingCounter = 0;
    ABSMedia mostStreamed = null;

    while(library.hasNext()) {
      ABSMedia current = library.next();
      if (current.getStreamCount() >= streamingCounter) {
        mostStreamed = current;
        streamingCounter = current.getStreamCount();
      }
    }
    return mostStreamed;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    MediaLibrary that = (MediaLibrary) obj;
    return Objects.equals(elements, that.elements);
  }

  @Override
  public int hashCode() {

    return Objects.hash(elements);
  }

//  @Override
//  public String toString() {
//    return "MediaLibrary{"
//        +
//        "elements=" +
//      for(ABSMedia media : elements) {
//          System.out.println(media);
//        }
//  }
}

