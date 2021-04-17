package test;

import java.time.LocalDate;
import java.time.Period;

public class Pesel {

    public static void main(String[] args) {
        System.out.println(majority("04212107090"));
    }

    public static boolean majority(String pesel) {
        char[] one = pesel.toCharArray();
        String data = "";
        String beginOfData = "";

        // Years 1800-1899
        if (one[2] == '8' || one[2] == '9') beginOfData = "18";
        // Years 1900-1999
        if (one[2] == '0' || one[2] == '1') beginOfData = "19";
        // Years 2000-2099
        if (one[2] == '2' || one[2] == '3') beginOfData = "20";
        // Years 2100-2199
        if (one[2] == '4' || one[2] == '5') beginOfData = "21";
        // Years 2200-2299
        if (one[2] == '6' || one[2] == '7') beginOfData = "22";

        for (int y = 0; y < one.length - 5; y++) {

            // first two numbers
            if (y < 2) data = data + Character.toString(one[y]);
            if (y == 2) data = data + "-";

            // second two numbers
            if (y == 3) {
                if (Character.getNumericValue(one[2]) == 1) {
                    switch (Character.getNumericValue(one[3])) {
                        case 0:
                            data = data + "10";
                            break;
                        case 1:
                            data = data + "11";
                            break;
                        case 2:
                            data = data + "12";
                            break;
                    }
                } else {
                    for (int c = 1; c < 10; c++) {
                        if (Character.getNumericValue(one[3]) == c)
                            data = data + "0" + Character.toString(one[3]) + "-";
                    }
                }

            }
            // third two numbers
            if (y >= 4 && y < 6) data = data + Character.toString(one[y]);
        }
        // DAY OF BIRTH
        data = beginOfData + data;
        System.out.println(data + " data urodzin");

        LocalDate birthDate = LocalDate.parse(data);
        LocalDate localDate = LocalDate.now();

        Period period = Period.between(birthDate, localDate);
        System.out.println("Pesel o numerach: " + pesel + " ma: " + period.getYears() + " lat");

        if (period.getYears() >= 18) return true;

        return false;
    }
}
