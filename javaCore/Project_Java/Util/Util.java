package Util;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Util {

    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static final String ALL = alpha + alphaUpperCase + digits + specials;

    private static Random generator = new Random();


    /**
     * Random string with a-zA-Z0-9, not included special characters
     */
    public static String randomId(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }


    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }

    public static String formatMoney(long money){
        String pattern = "###,###,###.00";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(money);
    }

    public static String formatDate (LocalDate date){
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(myFormat);
    }

    public static Object uppercaseName(String message){
        //khai báo một mảng, sau đó sử dụng phương thức toCharArray() để chuyển đổi message thành một mảng kiểu char
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0; i < charArray.length; i++) {
            // nếu phần tử trong mảng là một chữ cái
            if(Character.isLetter(charArray[i])) {
                // kiểm tra khoảng trắng có trước chữ cái
                if(foundSpace) {
                    //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        // chuyển đổi mảng char thành string
        message = String.valueOf(charArray);
        return message;
    }

}