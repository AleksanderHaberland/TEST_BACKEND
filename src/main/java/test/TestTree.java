package test;

import java.util.Arrays;
import java.util.Iterator;
public class TestTree {

    public static void main(String[] args) {
        String[] drzewa = {"brzoza", "modrzew", "grab", "buk", "wierzba"};
//////////////////////////////////////////////////////////////////////////////////
                                    /// 1 ///
        // Iterator with generic <>
        Iterator<String> drzewo = Arrays.asList(drzewa).iterator();

        while (drzewo.hasNext()) {
            // iterates over String without casting
            System.out.println(drzewo.next());
        }
//////////////////////////////////////////////////////////////////////////////////
                                    /// 2 ///
        // normal iterate no generic
        Iterator drzewo2 = Arrays.asList(drzewa).iterator();

        while (drzewo2.hasNext()) {
            // casting
            String o = (String) drzewo2.next();
            System.out.println(o + " 2 ");
        }
    }
}
