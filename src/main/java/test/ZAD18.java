package test;

import java.util.*;

public class ZAD18 {


    public static void set(Object list) {
        System.out.println(((Set)list).toString());
    }
    public static void main(String[] args) {
        Set<Integer> list2 = new HashSet<>();
        list2.add(1);
        list2.add(3);
        set(list2); // WYNIK [1, 3]


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Test List
        System.out.println(getElement2(list, 1));
        // Test Set
        System.out.println(getElement2(list2, 1));
    }

    // GDZIE Mogą być problemy
    private static String getElement(Object list, Integer number) {
        return ((List) list).get(number).toString();
    }

    private static String getElement2(Object list, Integer number) {
        // Object to Collection
        //makeing Iterator
        Iterator element = ((Collection) list).iterator();
        String o = "";

        int i = 0;
        while (element.hasNext()) {
            if (number == 0) {
                o = String.valueOf(element.next());
                break;
            }
            if (i > 0 && i == number) {
                for (int y = 0; y <= number; y++) {
                    o = String.valueOf(element.next());
                }
                break;
            }
            i++;
        }
        return o;
    }
}
