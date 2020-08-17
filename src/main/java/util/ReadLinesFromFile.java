package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadLinesFromFile {
  public static List<String> readLinesFromFile(String fileLocation) {
    Path file = Paths.get(fileLocation);
    List<String> lines = new ArrayList<>();

    try (InputStream in = Files.newInputStream(file);
         BufferedReader reader =
             new BufferedReader(new InputStreamReader(in))) {
      String line;
      while ((line = reader.readLine()) != null) {
        lines.add(line);
      }
    } catch (IOException x) {
      System.err.println("Error. Reading from file failed.");
    }

    return lines;
  }
}
