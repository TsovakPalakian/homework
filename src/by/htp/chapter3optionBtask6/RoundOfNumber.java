package by.htp.chapter3optionBtask6;

public interface RoundOfNumber {

    default double roundOfNumber(double number) {
        number = number * 1000;
        int j = (int) Math.round(number);
        number = (double)j / 1000;
        return number;
    }

}
