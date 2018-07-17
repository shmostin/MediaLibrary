package edu.neu.ccs.cs5004.problem4;

import java.util.ArrayList;

public interface InterfaceLibrary  {

  /**
   * returns an sorted arrayList of all the media the given director has worked on in the library.
   * @param first the first name of the director
   * @param last the last name of the director
   *
   * Runtime: O(n^2 e) (e represents the sorting of the media by "collections.sort")
   * Space: O(n)
   *
   * @return a sorted arrrayList of the media a given director has worked on, most recent first.
   */
  ArrayList<ABSMedia> directorsWork(String first, String last);

  /**
   * adds a given Series or Movie to the library.
   *
   * It also checks to see if the given alias is already in use in the library.
   *
   * Runtime: O(n)
   * Space: O(n)
   *
   * @param newMedia the media we want to add to the library
   */
  void addMedia(ABSMedia newMedia);

  /**
   * increments the number of times that a Series or Movie has been streamed by 1.
   *
   * Runtime: O(n)
   * Space: O(n)
   *
   * @param alias the alias we want to update the stream count on
   */
  void updateStreaming(String alias);

  /**
   * returns the streamCount field of a ABSMedia type.
   * @param alias the alias of the Movie/Series of interest
   *
   * Runtime: O(n)
   * Space: O(n)
   * @return the total number of times a given Movie/Series has been streamed
   */
  Integer timesStreamed(String alias);

  /**
   * Returns the most streamed Movie/Series from the library.
   * If there are multiple that tie, return any one of them.
   *
   * Runtime: O(n)
   * Space: O(n)
   * @return either the most streamed Movie/Series or one of the most, if it is a tie.
   */
  ABSMedia mostStreamed();

}
