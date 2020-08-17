package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadDataFromLines {
  public static List<String> readDataFromLines(String fileLocation) {
    List<String> words = new ArrayList<>();

    for(String line : ReadLinesFromFile.readLinesFromFile(fileLocation)) {
      String[] wordsInLine = line.split(" ");
      Collections.addAll(words, wordsInLine);
    }

    return words;
  }
}
