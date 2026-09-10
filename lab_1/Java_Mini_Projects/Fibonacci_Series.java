import java.util.Scanner;

public class Fibonacci_Series {

    public static void main(String[] args) {
        int a = 0,
            b = 1,
            c = 0;

        System.out.println("Enter number : ");

        try (Scanner scan = new Scanner(System.in)) {
            int x = scan.nextInt();

            while (c < x) {
                System.out.println(c);
                c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
