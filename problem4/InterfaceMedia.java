package edu.neu.ccs.cs5004.problem4;

import java.util.ArrayList;

public interface InterfaceMedia {

  /**
   * returns the Alias for a the media it is called upon.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @return the Alias of the media called upon
   */
  String getAlias();

  /**
   * returns the Title for the media it is called upon.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @return the Title of the media called upon
   */
  String getTitle();

  /**
   * returns the Release Date for the media it is called upon.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @return the Release Date of the media called upon
   */
  Integer getReleaseDate();

  /**
   * returns the streamCount of ABSMedia it was called upon.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @return the streamCount
   */
  Integer getStreamCount();

  /**
   * Increments the streamCount of an ABSMedia by one
   */
  void incrementStreaming();

  /**
   * returns a list of the Directors for that media type.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @return a list of Directors for the media it is called upon
   */
  ArrayList<Director> getDirector();

  /**
   * returns a list of Actors for that media type.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @return a list of Actors for the media it is called upon
   */
  ArrayList<Actor> getActor();

  /**
   * Sets the Alias for a media type.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @param alias the alias name we want to use
   */
  void setAlias(String alias);

  /**
   * Sets the Title for a media type.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @param title is the title we want to use
   */
  void setTitle(String title);

  /**
   * Sets the Release Date for a media type.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @param date is the date we want to use
   */
  void setReleaseDate(Integer date);

  /**
   * Adds a Director to the list of directors.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @param first the first name of the director we want to add
   * @param last the last name of the director we want to add
   */
  void addDirector(String first, String last);

  /**
   * Adds an Actor to the list of Actors.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @param first the first name of the actor we want to add
   * @param last the last name of the actor we want to add
   */
  void addActor(String first, String last);


}
