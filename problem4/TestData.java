package edu.neu.ccs.cs5004.problem4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestData {
  public static Integer streamCount0 = new Integer(0);

  public static Name testName1 = new Name("Austin", "VanderWel");
  public static Name anotherN1 = new Name("Austin", "VanderWel");
  public static Name testName2 = new Name("James", "Bond");
  public static Name sameRefAsN1 = testName1;
  public static Name sameStateAsN1 = new Name("Austin", "VanderWel");


  public static Director testDirector1 = new Director(testName1);
  public static Director anotherDirector = new Director(testName1);
  public static Director sameRefAsD1 = testDirector1;
  public static Director sameStateAsD1 = new Director(new Name("Austin", "VanderWel"));
  public static Director diffDirector = new Director(testName2);
  public static ArrayList<Director> directorList = new ArrayList<Director>();
  public static ArrayList<Director> movie2Directors = new ArrayList<Director>();




  public static Actor testActor1 = new Actor(testName1);
  public static Actor testActor2 = new Actor(testName2);
  public static ArrayList<Actor> actorList = new ArrayList<Actor>();
  public static ArrayList<Actor> movie2Actors = new ArrayList<Actor>();



  ///////////////////////////////
  //MEDIA TEST DATA
  //////////////////////////////

  public static Media diffMovie = new Media("Anything", "21 Jump Street",
      new Integer(2008), streamCount0, directorList, actorList);
  public static Media testMovie1 = new Media("Jump Street", "21 Jump Street",
      new Integer(2008), streamCount0, directorList, actorList);
  public static Media testMovie2 = new Media("Jump Street2", "22 Jump Street",
      new Integer(2012), streamCount0, movie2Directors, movie2Actors);
  public static Media sameRefAsM1 = testMovie1;
  public static Media sameStateAsM1 = new Media("Jump Street", "21 Jump Street",
      new Integer(2008), streamCount0, directorList, actorList);
  public static Media anotherM1 = new Media("Jump Street", "21 Jump Street",
      new Integer(2008), streamCount0, directorList, actorList);

  public static Set<ABSMedia> testSet1 = new HashSet<>();
  public static Set<ABSMedia> testSet2 = new HashSet<>();
  public static Set<ABSMedia> testSet3 = new HashSet<>();
  public static Set<ABSMedia> testSet4 = new HashSet<>();
  public static Set<ABSMedia> testSet5 = new HashSet<>();
  public static Set<ABSMedia> testSet6 = new HashSet<>();
  public static Set<ABSMedia> testSet7 = new HashSet<>();
  public static Set<ABSMedia> testSet8 = new HashSet<>();








  ///////////////////////////////
  //MEDIA LIBRARY
  //////////////////////////////

  public static MediaLibrary diffLibrary = new MediaLibrary(testSet8);
  public static MediaLibrary testLibrary1 = new MediaLibrary(testSet1);
  public static MediaLibrary testLibrary2 = new MediaLibrary(testSet2);
  public static MediaLibrary testLibrary3 = new MediaLibrary(testSet3);
  public static MediaLibrary testLibrary4 = new MediaLibrary(testSet4);
  public static MediaLibrary testLibrary5 = new MediaLibrary(testSet5);
  public static MediaLibrary testLibrary6 = new MediaLibrary(testSet6);

  public static MediaLibrary testLibrary7 = new MediaLibrary(testSet7);
  public static MediaLibrary sameRefAsL7 = testLibrary7;
  public static MediaLibrary sameStateAsL7 = new MediaLibrary(testSet7);
  public static MediaLibrary anotherLibrary = new MediaLibrary(testSet7);
  public static MediaLibrary testLibrary8 = new MediaLibrary(testSet7);



}
