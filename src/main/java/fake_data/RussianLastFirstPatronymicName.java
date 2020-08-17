package fake_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import util.ReadDataFromLines;
import util.SeekIndex;
import util.SeekWordToCompareWith;

public class RussianLastFirstPatronymicName {
  public static List<String> generateFakeRussianLastFirstPatronymicNames(int numberOfEntries) {
    String spaceSplitter = " ";
    String semicolonSplitter = ";";
    String russianLastNamesFile = "src/main/java/fake_data/RussianLastNames";
    String russianFirstNamesFile = "src/main/java/fake_data/RussianFirstNames";
    String russianPatronymicNamesFile = "src/main/java/fake_data/RussianPatronymicNames";
    String firstManRussianLastNameFile = "src/main/resources/FirstManRussianLastName";
    String firstManRussianFirstNameFile = "src/main/resources/FirstManRussianFirstName";
    String firstManRussianPatronymicNameFile = "src/main/resources/FirstManRussianPatronymicName";
    List<String> russianLastFirstPatronymicNames = new ArrayList<>();
    List<String> russianFirstNames = ReadDataFromLines.readDataFromLines(russianFirstNamesFile);
    List<String> russianLastNames = ReadDataFromLines.readDataFromLines(russianLastNamesFile);
    List<String> russianPatronymicNames =
        ReadDataFromLines.readDataFromLines(russianPatronymicNamesFile);
    String manRussianLastNameToCompareWith =
        SeekWordToCompareWith.seekWordToCompareWith(firstManRussianLastNameFile, 0);
    String manRussianPatronymicNameToCompareWith =
        SeekWordToCompareWith.seekWordToCompareWith(firstManRussianPatronymicNameFile, 0);

    for (int i = 0; i < numberOfEntries; i++) {
      Random random = new Random();
      int randomFromFirstNames = random.nextInt(russianFirstNames.size());
      int randomFromLastNames = 0;
      int randomFromPatronymicNames = 0;
      String lastName = "";
      String firstName = russianFirstNames.get(randomFromFirstNames);
      String patronymicName = "";
      int firstManRussianFirstNameIndex =
          SeekIndex.seekIndex(russianFirstNamesFile, firstManRussianFirstNameFile, 0);
      int firstManRussianLastNameIndex =
          SeekIndex.seekIndex(russianLastNamesFile, firstManRussianLastNameFile, 0);
      int firstManRussianPatronymicNameIndex =
          SeekIndex.seekIndex(russianPatronymicNamesFile, firstManRussianPatronymicNameFile, 0);

      for(int j = 0; j < russianFirstNames.size(); j++) {
        if(j >= firstManRussianFirstNameIndex) {
          for (String russianLastName : russianLastNames) {
            if (russianLastName.equals(manRussianLastNameToCompareWith)) {
              randomFromLastNames = firstManRussianLastNameIndex + random.nextInt(russianLastNames.size() -
                  firstManRussianLastNameIndex);
              lastName = russianLastNames.get(randomFromLastNames);
            }
          }
          for (String russianPatronymicName : russianPatronymicNames) {
            if (russianPatronymicName.equals(manRussianPatronymicNameToCompareWith)) {
              randomFromPatronymicNames = firstManRussianPatronymicNameIndex +
                  random.nextInt(russianPatronymicNames.size() - firstManRussianPatronymicNameIndex);
              patronymicName = russianPatronymicNames.get(randomFromPatronymicNames);
            }
          }
        } else {
          for (String russianLastName : russianLastNames) {
            if (russianLastName.equals(manRussianLastNameToCompareWith)) {
              randomFromLastNames = random.nextInt(firstManRussianLastNameIndex);
              lastName = russianLastNames.get(randomFromLastNames);
            }
          }
          for (String russianPatronymicName : russianPatronymicNames) {
            if (russianPatronymicName.equals(manRussianPatronymicNameToCompareWith)) {
              randomFromPatronymicNames = random.nextInt(firstManRussianPatronymicNameIndex);
              patronymicName = russianPatronymicNames.get(randomFromPatronymicNames);
            }
          }
        }
      }

      russianLastFirstPatronymicNames.add(
          lastName
              + spaceSplitter
              + firstName
              + spaceSplitter
              + patronymicName
              + semicolonSplitter);
    }

    return russianLastFirstPatronymicNames;
  }
}
