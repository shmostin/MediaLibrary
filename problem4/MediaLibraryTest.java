
package edu.neu.ccs.cs5004.problem4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static edu.neu.ccs.cs5004.problem4.TestData.*;

public class MediaLibraryTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void findDirector() {
    testMovie1.getDirector().add(new Director(new Name("Austin", "VanderWel")));
    testMovie2.getDirector().add(new Director(new Name("Austin", "VanderWel")));
    diffMovie.getDirector().add(new Director(new Name("Jon", "Jakeman")));

    ArrayList<ABSMedia> expectedArray = new ArrayList<>();
    expectedArray.add(testMovie1);
    expectedArray.add(testMovie2);
    Collections.sort(expectedArray, Collections.reverseOrder());

    System.out.println("number of directors: " + testMovie1.director.size());
    testLibrary1.addMedia(testMovie1);
    testLibrary1.addMedia(testMovie2);
    diffLibrary.addMedia(diffMovie);

    testLibrary1.directorsWork("Austin", "VanderWel");
    Assert.assertEquals(testLibrary1.directorsWork("Austin", "VanderWel"), expectedArray);
    try {
      diffLibrary.directorsWork("Austin", "Vanderwel");
    } catch (NoMediaException e) {
      //If we made it here the test passed
    } catch (Exception e) {
      Assert.fail();
    }
  }
  @Test
  public void addMedia() {
    System.out.println(testLibrary1.elements.size());
    testLibrary2.addMedia(testMovie1);
    System.out.println("before i add to the library:" + testLibrary1.elements.size());
    testLibrary3.addMedia(testMovie1);
    System.out.println("after i add to the library:" + testLibrary1.elements.size());
    Assert.assertTrue(testLibrary3.elements.equals(testLibrary2.elements));

  }

  @Test
  public void updateStreaming() {
    System.out.println(testLibrary4.elements.size());

    testLibrary4.addMedia(testMovie1);
    System.out.println("Before updating the streaming: " + testMovie1.getStreamCount());
    Assert.assertEquals(testLibrary4.elements.stream().findFirst().get().streamCount, 0);
    testLibrary4.updateStreaming("Jump Street");
    System.out.println("After updating the streaming: " + testMovie1.getStreamCount());
    Assert.assertEquals(testLibrary4.elements.stream().findFirst().get().streamCount, 1);
    testLibrary4.updateStreaming("Jump Street");
    Assert.assertEquals(testLibrary4.elements.stream().findFirst().get().streamCount, 2);



  }

  @Test
  public void timesStreamed() {

    testLibrary5.addMedia(testMovie2);
    testLibrary5.updateStreaming("Jump Street2");
    testLibrary5.updateStreaming("Jump Street2");
    testLibrary5.updateStreaming("Jump Street2");
    System.out.println(testMovie2.getStreamCount());
    Assert.assertEquals(testLibrary5.timesStreamed("Jump Street2"), 3);

  }

  @Test
  public void mostStreamed() {
    testLibrary6.addMedia(testMovie1);
    testLibrary6.addMedia(testMovie2);
    testLibrary6.updateStreaming("Jump Street");
    testLibrary6.updateStreaming("Jump Street");
    testLibrary6.updateStreaming("Jump Street");

    testLibrary6.updateStreaming("Jump Street2");
    testLibrary6.updateStreaming("Jump Street2");
    testLibrary6.updateStreaming("Jump Street2");
    testLibrary6.updateStreaming("Jump Street2");
    System.out.println(testMovie1.getStreamCount());
    System.out.println(testMovie2.getStreamCount());
    System.out.println(testLibrary6.mostStreamed().getTitle());
    Assert.assertTrue(testLibrary6.mostStreamed() == (testMovie2));
    testLibrary6.updateStreaming("Jump Street");
    testLibrary6.updateStreaming("Jump Street");
    testLibrary6.updateStreaming("Jump Street");
    testLibrary6.updateStreaming("Jump Street");
    Assert.assertTrue(testLibrary6.mostStreamed() == (testMovie1));

  }

  @Test
  public void hashCodeTest() {
    Assert.assertEquals(testLibrary7.equals(sameRefAsL7), testLibrary7.hashCode() == sameRefAsL7.hashCode()); //same object
    Assert.assertEquals(testLibrary7.equals(sameStateAsL7), testLibrary7.hashCode() == sameStateAsL7.hashCode());//equal object
  }

  @Test
  public void equalsTest() {
    Assert.assertEquals(testLibrary7, testLibrary7); //reflexive
    Assert.assertEquals(testLibrary7, sameRefAsL7); //symmetry
    Assert.assertEquals(testLibrary7.equals(sameStateAsL7) && sameStateAsL7.equals(anotherLibrary), testLibrary7.equals(anotherLibrary)); //transitive
    Assert.assertFalse(testLibrary7.equals(null)); //testHRManager is not null
//    Assert.assertFalse(testLibrary7.equals(testLibrary8)); //objects have different states
  }

//  @Test
//  public void toStringTest() {
//
//  String testString = "MediaLibrary{"
//      +
//      "elements="
//      +
//      testLibrary1.elements
//      +
//      '}';
//
//    Assert.assertEquals(testString, testLibrary1.elements.toString());
//
//  }
}
