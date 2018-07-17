package edu.neu.ccs.cs5004.problem4;

import java.util.ArrayList;
import java.util.Objects;

public abstract class ABSMedia implements InterfaceMedia, Comparable{
  private String alias;
  private String title;
  private Integer releaseDate;
  protected Integer streamCount;
  protected ArrayList<Director> director;
  private ArrayList<Actor> actor;

  public ABSMedia(String alias, String title, Integer releaseDate, Integer streamCount, ArrayList<Director> director, ArrayList<Actor> actor) {
    this.alias = alias;
    this.title = title;
    this.releaseDate = releaseDate;
    this.streamCount = streamCount;
    this.director = director;
    this.actor = actor;
  }



  @Override
  public String getAlias() {
    return this.alias;
  }

  @Override
  public String getTitle() {
    return this.title;
  }

  @Override
  public Integer getReleaseDate() {
    return this.releaseDate;
  }

  public Integer getStreamCount() {
    return this.streamCount;
  }

  public void incrementStreaming() {
    this.streamCount += 1;
  }

  @Override
  public ArrayList<Director> getDirector() {
    return this.director;
  }

  @Override
  public ArrayList<Actor> getActor() {
    return this.actor;
  }

  @Override
  public void setAlias(String alias) {
    this.alias = alias;
  }

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void setReleaseDate(Integer date) {
    this.releaseDate = date;
  }

  @Override
  public void addDirector(String first, String last) {
    Name newName = new Name(first, last);
    Director newDirector = new Director(newName);
    this.director.add(newDirector);
  }

  @Override
  public void addActor(String first, String last) {
    Name newName = new Name(first, last);
    Actor newActor = new Actor(newName);
    this.actor.add(newActor);
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    ABSMedia absMedia = (ABSMedia) obj;
    return Objects.equals(alias, absMedia.alias) &&
        Objects.equals(title, absMedia.title) &&
        Objects.equals(releaseDate, absMedia.releaseDate) &&
        Objects.equals(streamCount, absMedia.streamCount) &&
        Objects.equals(director, absMedia.director) &&
        Objects.equals(actor, absMedia.actor);
  }

  @Override
  public int hashCode() {

    return Objects.hash(alias, title, releaseDate, streamCount, director, actor);
  }

  @Override
  public String toString() {
    return "ABSMedia{" +
        "alias='" + alias + '\'' +
        ", title='" + title + '\'' +
        ", releaseDate=" + releaseDate +
        ", streamCount=" + streamCount +
        ", director=" + director +
        ", actor=" + actor +
        '}';
  }
}
