package util;

public class MenLastNamesStartWithIndex {
  public static int getIndexOfFirstMenRussianLastName(
      String russianLastNamesFile, String fileWithFirstMenRussianLastName, int indexOfWordToCompareWith) {
    return SeekIndex.seekIndex(russianLastNamesFile, fileWithFirstMenRussianLastName, indexOfWordToCompareWith);
  }
}
