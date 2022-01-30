import java.util.Scanner;

public class excercise7 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj Liczbę dodatnią");

        int number = keyboard.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                System.out.print(i + "");

                System.out.println();


            }
        }

    }
}
