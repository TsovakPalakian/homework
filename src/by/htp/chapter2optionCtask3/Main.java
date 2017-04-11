package by.htp.chapter2optionCtask3;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10000000];
        randomFillingArray(array);
        up(array);
        System.out.println();
        down(array);
    }

    public static void randomFillingArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 + (int) (Math.random() * 900);
        }
    }

    public static void up(int[] array) {
        int counter = 0;
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if ( array[i] < array[i + 1] ) {
                counter++;
            } else {
                counter = 0;
            }
            tmp[i] = counter;
        }
        int k = tmp[0];
        int maxIndex = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > k) {
                k = tmp[i];
                maxIndex = i;
            }
        }
        System.out.print("Largest progression up is " + (tmp[maxIndex] + 1) + " elements: ");
        int p = (maxIndex - tmp[maxIndex] + 1 );
        for (int i = 0; i < tmp[maxIndex] + 1; i++) {
            System.out.print(array[p] + " ");
            p++;
        }
    }
    public static void down(int[] array) {
        int counter = 0;
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if ( array[i] > array[i + 1] ) {
                counter++;
            } else {
                counter = 0;
            }
            tmp[i] = counter;
        }
        int k = tmp[0];
        int maxIndex = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > k) {
                k = tmp[i];
                maxIndex = i;
            }
        }
        System.out.print("Largest progression down is " + (tmp[maxIndex] + 1) + " elements: ");
        int p = (maxIndex - tmp[maxIndex] + 1 );
        for (int i = 0; i < tmp[maxIndex] + 1; i++) {
            System.out.print(array[p] + " ");
            p++;
        }
    }
}
