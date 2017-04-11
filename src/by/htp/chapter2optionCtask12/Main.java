package by.htp.chapter2optionCtask12;

public class Main {

    private static int n = 0, m = 0;

    public static void main(String[] args) {
        int[][] array = new int[15][25];
        randomFillingArray(array);
        System.out.println((char) 27 + "[34m" + "Before..." + (char) 27 + "[30m ");
        printArray(array);
        swap(7, 17, array);
    }

    public static void randomFillingArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 100 + (int) (Math.random() * 900);
            }
        }
    }

    public static void swap(int t, int r, int[][] array) {
        if (array.length > t && array[0].length > r ) {
            if (t - n > 0) {
                for (int i = n; i < t; i++) {
                    Object tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = (int[]) tmp;
                }
            } else {
                for (int i = n; i > t; i--) {
                    Object tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = (int[]) tmp;
                }
            }
            if (r - m > 0) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = m; j < r; j++) {
                        int tmp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = tmp;
                    }
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    for (int j = m; j > r; j--) {
                        int tmp = array[i][j];
                        array[i][j] = array[i][j - 1];
                        array[i][j - 1] = tmp;
                    }
                }
            }
            searchMinElement(array);
            System.out.println((char) 27 + "[34m" + "After..." + (char) 27 + "[30m ");
            printArray(array);
        } else {
            System.out.println((char) 27 + "[31m" + "You have crossed all boundaries :)" );
            System.out.println();
            System.out.println("And after... nothing." + (char) 27 + "[30m" );
        }
    }

    public static void printArray(int[][] array) {
        searchMinElement(array);
        System.out.print("N% |");
        for (int i = 0; i < array[0].length; i++) {
            if (i < 10) {
                if (i == m ) {
                    System.out.print((char) 27 + "[31m" + " " + i + "  " + (char) 27 + "[30m");
                } else {
                    System.out.print(" " + i + "  ");
                }
            } else {
                if (i == m ) {
                    System.out.print((char) 27 + "[31m" + " " + i + " " + (char) 27 + "[30m");
                } else {
                    System.out.print(" " + i + " ");
                }
            }
        }
        System.out.println();
        System.out.print("---|");
        for (int i = 0; i < array[0].length; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i < 10) {
                if (i == n ) {
                    System.out.print((char) 27 + "[31m" + i + (char) 27 + "[30m " + " | " );
                } else {
                    System.out.print(i + "  | ");
                }
            } else {
                if (i == n ) {
                    System.out.print((char) 27 + "[31m" + i + (char) 27 + "[30m " + "| " );
                } else {
                    System.out.print(i + " | ");
                }
            }

            for (int j = 0; j < array[i].length; j++) {
                if (i == n && j == m) {
                    System.out.print((char) 27 + "[31m" + array[i][j] + (char) 27 + "[30m ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void searchMinElement(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    Main.n = i;
                    Main.m = j;
                }
            }
        }
    }
}