package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  WordCounter wordCounter;

  @Before
  public void setUp() {
    wordCounter = new WordCounter(new HashMap<>());
  }

  @After
  public void tearDown() {
    wordCounter = null;
  }

  @Test
  public void testGetCountEmpty() {
    assertEquals(wordCounter.getCounts().size(), 0);
  }

  @Test
  public void testGetCountNonEmpty() {
    wordCounter.countWords(Arrays.asList("asdf", "oiu", "asdf").iterator());
    assertEquals(wordCounter.getCounts().size(), 2);
    assertEquals(wordCounter.getCounts().get("asdf"), new Integer(2));
    assertEquals(wordCounter.getCounts().get("oiu"), new Integer(1));
  }
}
