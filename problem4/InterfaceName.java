package edu.neu.ccs.cs5004.problem4;

public interface InterfaceName {

  /**
   * returns the first name.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @return the first name
   */
  String getFirst();

  /**
   * returns the last name.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @return the last name
   */
  String getLast();

  /**
   * sets the first name.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @param first the first name
   */
  void setFirst(String first);


  /**
   * sets the last name.
   *
   * Runtime: O(1)
   * Space: O(1)
   *
   * @param last the last name
   */
  void setLast(String last);
}
