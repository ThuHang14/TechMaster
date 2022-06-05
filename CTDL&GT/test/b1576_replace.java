package test;

import java.util.Random;

public class b1576_replace {
    public static void main(String[] args) {

        System.out.println(modifyString("????????????????????????????????????????????????????????????????????????????????????????????????????"));

    }

    public static String modifyString(String s) {
        while (s.contains("?")) {
            s = convert(s);
        }
        return s;
    }

    public static String convert(String s) {
        Random random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        char a[] = s.toCharArray();
        try {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == '?') {
                    if (a[i - 1] != randomizedCharacter || a[i + 1] != randomizedCharacter) {
                        a[i] = randomizedCharacter;
                    } else {
                        randomizedCharacter = (char) (random.nextInt(26) + 'a');
                        a[i] = randomizedCharacter;

                    }
                }
            }
        } catch (Exception ignore) {
        }
        ;
        return String.valueOf(a);
    }
}
