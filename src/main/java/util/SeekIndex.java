package util;

import java.util.List;

public class SeekIndex {
  public static int seekIndex(String fileToSeekIndex, String fileWithWordToCompare, int indexOfWordToCompareWith) {
    List<String> words = ReadLinesFromFile.readLinesFromFile(fileToSeekIndex);

    for (int i = 0; i < words.size(); i++) {
      if (words.get(i).equals(SeekWordToCompareWith
          .seekWordToCompareWith(fileWithWordToCompare, indexOfWordToCompareWith))) {
        return i;
      }
    }

    return 0;
  }
}
