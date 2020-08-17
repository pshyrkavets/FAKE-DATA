package util;

public class MenPatronymicNamesStartWithIndex {
  public static int getIndexOfFirstMenRussianPatronymicName(
      String russianPatronymicNamesFile, String fileWithFirstMenRussianPatronymicName, int indexOfWordToCompareWith) {
    return SeekIndex.seekIndex(russianPatronymicNamesFile, fileWithFirstMenRussianPatronymicName, indexOfWordToCompareWith);
  }
}
