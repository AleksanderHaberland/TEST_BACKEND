package test;

import java.util.Arrays;

public class Word {
    public static void main(String[] args) {

        Word w = new Word();
       /* Proszę zaproponować kod źródłowy metody weryfikującej czy podane 2 wyrazy składają się z tych samych liter np.
        MARA – składa się z 1 litery M, 2 liter A, 1 litery R
        RAMA – składa się z 1 litery R, 2 liter A, 1 litery M
        Podane przykłady składają się z tych samych liter.
        Napisać podstawowe testy jednostkowe dla tej metody (jUnit). */

        System.out.println(w.words("MARA", "RAMA"));
    }

    public Boolean words(String wyraz1, String wyraz2) {
            // check length
            if (wyraz1.length() != wyraz2.length()) {
                return false;
            }

            char[] one = wyraz1.toCharArray();
            char[] two = wyraz2.toCharArray();
            Arrays.sort(one);
            Arrays.sort(two);

            if(Arrays.equals(one, two)){
                return true;
            }

        return false;
    }
}
