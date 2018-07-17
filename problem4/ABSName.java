package edu.neu.ccs.cs5004.problem4;

public abstract class ABSName implements InterfaceName{
  private String first;
  private String last;

  public ABSName(String first, String last) {
    this.first = first;
    this.last = last;
  }



  @Override
  public String getFirst() {
    return this.first;
  }

  @Override
  public String getLast() {
    return this.last;
  }

  @Override
  public void setFirst(String first) {
    this.first = first;
  }

  @Override
  public void setLast(String last) {
    this.last = last;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
