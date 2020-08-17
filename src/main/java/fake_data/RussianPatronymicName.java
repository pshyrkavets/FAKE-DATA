package fake_data;

import java.util.List;
import util.ReadDataFromLines;

public class RussianPatronymicName {
  public static List<String> getRussianPatronymicNames(String fileLocation) {
    return ReadDataFromLines.readDataFromLines(fileLocation);
  }
}
