import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final Random random = new Random();

        int input;

        System.out.println("Введіть число: ");
        do {
            input = scan.nextInt();
        } while (input < 0 || input > 20);

        int[] numbers = random.ints(20, 0, 21).toArray();
        System.out.println("Згенерований масив: " + Arrays.toString(numbers));

        // там були якісь помилки стосовно effectively final, тому прийшлось створити нову змінну
        int targetNumber = input;

        long countOccurrences = Arrays.stream(numbers)
                .filter(number -> number == targetNumber)
                .count();

        if (countOccurrences > 0) {
            System.out.println(
                    "Число " + targetNumber
                    + " зустрічається " + countOccurrences + " раз(и)."
            );
        } else {
            System.out.println(
                    "Число " + targetNumber + " у масиві не зустрічається."
            );
        }
    }
}
