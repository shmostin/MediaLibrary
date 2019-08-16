package edu.neu.ccs.cs5004.problem4;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ABSNameTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void getFirst() {
    Assert.assertEquals(TestData.testName1.getFirst(), new String("Austin"));
    Assert.assertEquals(TestData.testDirector1.name.getFirst(), new String("Austin"));
  }

  @Test
  public void getLast() {
    Assert.assertEquals(TestData.testName1.getLast(), new String("VanderWel"));
    Assert.assertEquals(TestData.testDirector1.name.getLast(), new String("VanderWel"));
  }

  @Test
  public void setFirst() {
    TestData.testName1.setFirst("Dave");
    Assert.assertTrue(TestData.testName1.getFirst() == "Dave");
    System.out.println(TestData.testName1.getFirst());
    System.out.println("back to");
    TestData.testName1.setFirst("Austin");
    System.out.println(TestData.testName1.getFirst());

  }

  @Test
  public void setLast() {
    TestData.testName1.setLast("Franco");
    Assert.assertTrue(TestData.testName1.getLast() == "Franco");
    System.out.println(TestData.testName1.getLast());
    System.out.println("back to");
    TestData.testName1.setLast("VanderWel");
    System.out.println(TestData.testName1.getLast());
  }

  @Test
  public void hashCodeTest() {
    Assert.assertEquals(TestData.testName1.equals(TestData.sameRefAsN1), TestData.testName1.hashCode() == TestData.sameRefAsN1.hashCode()); //same object
    Assert.assertEquals(TestData.testName1.equals(TestData.sameStateAsN1), TestData.testName1.hashCode() == TestData.sameStateAsN1.hashCode()); //equal objects

  }

  @Test
  public void equalsTest() {
    Assert.assertEquals(TestData.testName1, TestData.testName1); //reflexive
    Assert.assertEquals(TestData.testName1, TestData.sameRefAsN1); //symmetry
    org.junit.Assert.assertEquals(TestData.testName1.equals(TestData.sameStateAsN1) && TestData.sameStateAsN1.equals(TestData.anotherN1), TestData.testName1.equals(TestData.anotherN1)); //transitive
    org.junit.Assert.assertFalse(TestData.testName1.equals(null)); //testHRManager is not null
    org.junit.Assert.assertFalse(TestData.testName1.equals(TestData.testName2)); //objects have different states
  }
}