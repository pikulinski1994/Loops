public class Breakcontinue {

    public static void main(String[] args) {
        // break
        for (int i = 0; i < 10; i++) {
            System.out.println("przebieg nr: " + i);
            if (i > 5) {
                break;
            }
            System.out.println("koniec przebiegu");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // continue
        for (int i = 0; i < 10; i++) {
            System.out.println("przebieg nr: " + i);
            if (i > 5 && i <= 7) {
                continue;
            }
            System.out.println("koniec przebiegu");
        }
    }
}
