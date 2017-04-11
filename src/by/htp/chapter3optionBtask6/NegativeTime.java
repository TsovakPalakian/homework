package by.htp.chapter3optionBtask6;

public class NegativeTime extends Exception {

    private double time;

    public NegativeTime(double time) {
        super();
        this.time = time;
    }

    public double getNumber() { return time; }

}
