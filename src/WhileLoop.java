public class WhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        boolean flag = true;
        while (counter < 10 && flag) {
            // body
            System.out.println("przebieg pętli numer: " + counter);
            counter++;
            if (counter * counter > 80) {
                flag = false;
            }
        }
        // 1. sprawdź warunek czy kontunuować pętlę
        //   1.1 jeśli tak to przejdź do 2.
        //   1.2 jeśli nie to zakończ pętlę
        // 2. wykonaj blok kodu
        // 3. wróć do punktu 1.
        System.out.println();
        System.out.println();
        //============= do-while
        System.out.println("do-while");
        int i = 1;
        do {
            System.out.println("przebieg nr: " + i);
            i++;
        } while(i < 0);
        // 1. wykonaj blok kodu
        // 2. sprawdz warunek
        //    2.1 spelniony -> wroc do 1.
        //    2.2 niespelniony -> zakoncz petle
    }
}