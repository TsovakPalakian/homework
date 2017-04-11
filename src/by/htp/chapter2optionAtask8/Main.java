package by.htp.chapter2optionAtask8;

public class Main {
    static int k = 0;
    public static void main(String[] args) {

        String[] polindrome = new String[1002002];

        for (int i = 0; i < polindrome.length; i++) {
            polindrome[i] = String.valueOf(i);
        }

        for (int i = 0; i < polindrome.length; i++) {
            char[] chars = polindrome[i].toCharArray();
            setK(0);
            for (int j = 0; j < chars.length/2; j++) {
                equals(getK(), chars.length/2, chars[j], chars[chars.length - j - 1], i);
            }
        }
    }

    public static void equals(int k, int length, char ch1, char ch2, int i) {
        if (ch1 == ch2) {
            setK(getK() + 1);
        }
        if (getK() == length) {
            System.out.println(i);
        }
    }

    public static int getK() {
        return k;
    }

    public static void setK(int k) {
        Main.k = k;
    }
}
