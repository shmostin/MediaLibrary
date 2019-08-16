package edu.neu.ccs.cs5004.problem4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void compareTo() {
    Assert.assertEquals(TestData.testMovie1.compareTo(TestData.sameStateAsM1), 0);
  }
}