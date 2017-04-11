package by.htp.chapter3optionBtask9;

public class ImpossibleRadius extends Exception {

    private double radius;

    public ImpossibleRadius(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
