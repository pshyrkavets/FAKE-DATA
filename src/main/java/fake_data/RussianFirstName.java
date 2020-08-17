package fake_data;

import java.util.List;
import util.ReadDataFromLines;

public class RussianFirstName {
  public static List<String> getRussianFirstNames(String fileLocation) {
    return ReadDataFromLines.readDataFromLines(fileLocation);
  }
}
