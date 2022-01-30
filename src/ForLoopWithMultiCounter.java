public class ForLoopWithMultiCounter {

    public static void main(String[] args) {
        for (int i = 1, j = 10; i < 5 && j != 7; i++, j--) {
            System.out.println(i + " vs. " + j);
        }
        // warunek moze dowolnie zlozonym wyrazaniem logicznym
        // musi sie obliczac do pojedynczego true/false
        // (i >= 2 || i <= 20) && j > 5 && (count != j)
        // moge miec wiecej niz jeden licznik
        // ALE: one musza byc tego samego typu!
        // for (int i = 1, double x = 2.0; ; ) {} // blad
        //
        // warunek moze byc tylko 1!
        // for (int i = 1, j = 10; count < 10, i < 10;) {} // blad
        //
        // instukcji zmiany licznik moze byc wiecej niz 1
    }


}
