package edu.neu.ccs.cs5004.problem4;

import java.util.ArrayList;

public class Media extends ABSMedia {


  public Media(String alias, String title, Integer releaseDate, Integer streamCount,
               ArrayList<Director> director, ArrayList<Actor> actor) {
    super(alias, title, releaseDate, streamCount, director, actor);
  }



  @Override
  public int compareTo(Object media) {
    return (this.getReleaseDate() < ((ABSMedia)media).getReleaseDate() ? -1 : (this.getReleaseDate().equals(((ABSMedia) media).getReleaseDate()) ? 0 : 1));

  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
