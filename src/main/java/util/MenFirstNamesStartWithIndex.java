package util;

public class MenFirstNamesStartWithIndex {
  public static int getIndexOfFirstMenRussianFirstName(
      String russianFirstNamesFile, String fileWithFirstMenRussianFirstName, int indexOfWordToCompareWith) {
    return SeekIndex.seekIndex(russianFirstNamesFile, fileWithFirstMenRussianFirstName, indexOfWordToCompareWith);
  }
}
