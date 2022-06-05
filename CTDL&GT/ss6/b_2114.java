package ss6;

public class b_2114 {
    public static void main(String[] args) {
        String[] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj",
        "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom",
                "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg",
                "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm"
                , "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr",
                "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk",
                "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo", "qstd zui nbbohtuk", "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"}
        ;
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int kq = 0;
        for (String str : sentences
        ) {
            int count = dem(str);
            if (count > kq) {
            kq = count;}
        }

        return kq;
    }

    public static int dem(String sentences) {
        String[] arr = sentences.split(" ");
        return arr.length;
    }

}
