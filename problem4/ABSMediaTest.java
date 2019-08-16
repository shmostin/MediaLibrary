package edu.neu.ccs.cs5004.problem4;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import static edu.neu.ccs.cs5004.problem4.TestData.*;
import static org.junit.Assert.*;

public class ABSMediaTest {

  @Before
  public void setUp() throws Exception {
    testMovie2.getDirector().add(new Director(new Name("Austin", "VanderWel")));
    testMovie2.getActor().add(new Actor(new Name("Justin", "Timberlake")));

  }

  @Test
  public void getAlias() {
    Assert.assertEquals(testMovie1.getAlias(), "Jump Street");
  }

  @Test
  public void getTitle() {
    System.out.println(testMovie1.getTitle());
    Assert.assertEquals(testMovie1.getTitle(), "21 Jump Street");
  }

  @Test
  public void getReleaseDate() {
    Assert.assertEquals(testMovie1.getReleaseDate(), new Integer(2008));
  }

  @Test
  public void getDirector() {
    System.out.println("number of directors: " + testMovie1.getDirector().size());
//    testMovie1.addDirector("Jake", "Clark");
    Assert.assertEquals(testMovie1.getDirector(), directorList);
  }

  @Test
  public void getActor() {
    Assert.assertEquals(testMovie1.getActor(), actorList);
  }

  @Test
  public void setAlias() {
    testMovie1.setAlias("Sit Street");
    Assert.assertTrue(testMovie1.getAlias().equals("Sit Street"));
    testMovie1.setAlias("Jump Street");
  }

  @Test
  public void setTitle() {
    testMovie1.setTitle("22 Jump Street");
    Assert.assertTrue(testMovie1.getTitle() == "22 Jump Street");
    testMovie1.setTitle("21 Jump Street");
  }

  @Test
  public void setReleaseDate() {
    testMovie1.setReleaseDate(2014);
    Assert.assertTrue(testMovie1.getReleaseDate() == 2014);
    testMovie1.setReleaseDate(2008);
  }

  @Test
  public void addDirector() {
    testMovie1.addDirector("Austin", "VanderWel");
    Assert.assertTrue(testMovie1.getDirector().get(0).name.getFirst().equals(testMovie2.getDirector().get(0).name.getFirst()));
    System.out.println("using get():");
    System.out.println(testMovie1.getDirector().get(0).name.getFirst());
    System.out.println("using iterator():");

    System.out.println(testMovie1.getDirector().iterator().next().name.getFirst());
    testMovie1.getDirector().remove(0);

  }

  @Test
  public void addActor() {
    testMovie1.addActor("Bob", "Builder");
    Assert.assertFalse(testMovie1.getActor().get(0).name.getFirst().equals(testMovie2.getActor().get(0).name.getFirst()));
    testMovie1.addActor("Justin", "Timberlake");
    Assert.assertTrue(testMovie1.getActor().get(1).name.getFirst().equals(testMovie2.getActor().get(0).name.getFirst()));
    System.out.println(testMovie1.getActor().size());

  }

  @Test
  public void hashCodeTest() {
    Assert.assertEquals(testMovie1.equals(sameRefAsM1), testMovie1.hashCode() == sameRefAsM1.hashCode()); //same object
    Assert.assertEquals(testMovie1.equals(sameStateAsM1), testMovie1.hashCode() == sameStateAsM1.hashCode());//equal object
  }

  @Test
  public void equalsTest() {
    Name jimmy = new Name("Jimmy", "NotaPerson");
    Director jimmyD = new Director(jimmy);
    Actor jimmyA = new Actor(jimmy);
    ArrayList<Actor> actList = new ArrayList<>();
    ArrayList<Director> dirList = new ArrayList<>();
    actList.add(jimmyA);
    dirList.add(jimmyD);
    Media test = new Media("Monkeys", "More Monkeys",
        new Integer(2000), new Integer(100), dirList, actList);
    Media test2 = new Media("alias","NotA real movie", new Integer(102),
        new Integer(1), directorList, actorList);

    Assert.assertEquals(testMovie1, testMovie1); //reflexive
    Assert.assertEquals(testMovie1, sameRefAsM1); //symmetry
    Assert.assertEquals(testMovie1.equals(sameStateAsM1) &&
        sameStateAsM1.equals(anotherM1), testMovie1.equals(anotherM1)); //transitive
    Assert.assertFalse(testMovie1.equals(null)); //testHRManager is not null
    Assert.assertFalse(testMovie1.equals(testMovie2)); //objects have different states
    Assert.assertFalse(testMovie1.equals("not a Test Movie"));
    Assert.assertFalse(testMovie1.equals(test));
    Assert.assertFalse(testMovie1.equals(test2));
  }

  @Test
  public void toStringTest() {
    String testString = "ABSMedia{" +
        "alias='" + testMovie1.getAlias() + '\'' +
        ", title='" + testMovie1.getTitle() + '\'' +
        ", releaseDate=" + testMovie1.getReleaseDate() +
        ", streamCount=" + testMovie1.streamCount +
        ", director=" + testMovie1.director +
        ", actor=" + testMovie1.getActor() +
        '}';

    Assert.assertTrue(testString.equals(testMovie1.toString()));
  }
}