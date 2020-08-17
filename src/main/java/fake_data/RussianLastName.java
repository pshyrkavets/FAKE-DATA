package fake_data;

import java.util.List;
import util.ReadDataFromLines;

public class RussianLastName {
  public static List<String> getRussianLastNames(String fileLocation) {
    return ReadDataFromLines.readDataFromLines(fileLocation);
  }
}
