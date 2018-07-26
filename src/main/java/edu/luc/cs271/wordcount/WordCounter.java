package edu.luc.cs271.wordcount;

import java.util.*;

/** A map-based class for counting word frequencies from an iterator. */
public class WordCounter {

  /** The map for storing the word counts. */
  private final Map<String, Integer> theMap;

  /** Creates a word counter instance based on the given map. */
  public WordCounter(final Map<String, Integer> theMap) {
    this.theMap = theMap;
  }

  /** Counts the frequencies of all words in the given iterator. */
  public void countWords(final Iterator<String> words) {
    String word;
    while (words.hasNext()){
      word = words.next();
      theMap.put(word, theMap.getOrDefault(word, 0) + 1);
    }
  }

  /** Retrieve the frequency of a particular word. */
  public int getCount(final String word) {
    return theMap.getOrDefault(word, -1);
  }

  /** Retrieve the map representing all word frequencies. */
  public Map<String, Integer> getCounts() {
    if(theMap != null)
      return Collections.unmodifiableMap(theMap);
    else
      return null;
  }
}
