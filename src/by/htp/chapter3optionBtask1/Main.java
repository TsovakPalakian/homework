package by.htp.chapter3optionBtask1;

public class Main {

    private final static int k = 10;

    private static RationalFraction[] rationalFractions;

    public static void main(String[] args) {
        rationalFractions = new RationalFraction[k];
        for (int i = 0; i < k; i++) {
            rationalFractions[i] = new RationalFraction(i^3 + 9, i*i + 3);
        }
        for (RationalFraction r : rationalFractions) {
            System.out.println(r);
        }
        RationalFraction.substitution(rationalFractions);
        System.out.println();
        for (RationalFraction r : rationalFractions) {
            System.out.println(r);
        }
    }
}
