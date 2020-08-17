package fake_data;

import java.util.List;

public class FakeData {
  public static void main(String[] args) {
    if (args.length < 2 || args.length > 3) {
      System.out.println(
          "The first parameter should set region and language (en_US, ru_RU or be_BY).\n"
              + "The second parameter should set the number of fake data entries for generation.\n"
              + "The third parameter should set the average number of errors for one fake data entry (0 errors by default).\n"
              + "Input the first and second or first, second and third parameters to the program.\n"
              + "Example: ru_RU 1000000");
    }

    List<String> russianLastFirstPatronymicNames = RussianLastFirstPatronymicName
        .generateFakeRussianLastFirstPatronymicNames(Integer.parseInt(args[1]));
    long start = System.currentTimeMillis();

    for (String russianLastFirstPatronymicName : russianLastFirstPatronymicNames) {
      System.out.println(russianLastFirstPatronymicName);
    }

    long stop = System.currentTimeMillis();
    System.out.println(start - stop);
  }
}
