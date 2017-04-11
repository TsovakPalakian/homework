package by.htp.chapter3optionBtask1;

public class RationalFraction {

    private int n;
    private int m;
    private final static int k = 10;

    RationalFraction() {}
    RationalFraction(int n, int m) {
        this.n = n;
        this.m = m;
        if (m == 0) {
            throw new ArithmeticException();
        }
    }

    public static RationalFraction addition(RationalFraction ratA, RationalFraction ratB) {
        return new RationalFraction(ratA.n + ratB.n, ratA.m + ratB.m);
    }
    public static RationalFraction subtraction(RationalFraction ratA, RationalFraction ratB) {
        return new RationalFraction(ratA.n - ratB.n, ratA.m - ratB.m);
    }
    public static RationalFraction division(RationalFraction ratA, RationalFraction ratB) {
        return new RationalFraction(ratA.n / ratB.n, ratA.m / ratB.m);
    }
    public static RationalFraction multiplication(RationalFraction ratA, RationalFraction ratB) {
        return new RationalFraction(ratA.n * ratB.n, ratA.m * ratB.m);
    }

    public static void substitution(RationalFraction[] rationalFraction) {
        for (int i = 0; i < k ; i += 2) {
            rationalFraction[i] = addition(rationalFraction[i], rationalFraction[i + 1]);
        }
    }

    @Override
    public String toString() {
        return "RationalFraction{" +
                "n=" + n +
                ", m=" + m +
                '}';
    }
}
