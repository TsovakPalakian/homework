package by.htp.chapter3optionBtask9;

public interface Analytical {

    void area();
    void perimeter();

    double minAreaValue();
    double maxAreaValue();
    double minPerimeterValue();
    double maxPerimeterValue();

    void group();

    default double roundOfNumber(double number) {
        number = number * 1000;
        int j = (int) Math.round(number);
        number = (double)j / 1000;
        return number;
    }
}
