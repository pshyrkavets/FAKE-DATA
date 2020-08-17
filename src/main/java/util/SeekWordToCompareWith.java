package util;

public class SeekWordToCompareWith {
  public static String seekWordToCompareWith(String fileWithWordToCompare, int indexOfWordToCompareWith) {
    return ReadDataFromLines.readDataFromLines(fileWithWordToCompare).get(indexOfWordToCompareWith);
  }
}
