package by.htp.chapter3optionBtask9;

import static java.lang.Math.PI;

public class Circle extends Shape {

    private int arraySize;
    private double radius;
    private Circle[] circles;
    private double[] arrayArea;
    private double[] arrayPerimeter;

    public Circle(int arraySize) {
        this.arraySize = arraySize;
        circles = new Circle[getArraySize()];
        initializationArrayOfCircle();
        area();
        perimeter();
    }
    private Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getArraySize() {
        return arraySize;
    }

    public Circle[] getCircles() {
        return circles;
    }

    @Override
    public void area() {
        arrayArea = new double[getArraySize()];
        for (int i = 0; i < getArraySize(); i++) {
            arrayArea[i] = roundOfNumber(PI * circles[i].radius * circles[i].radius);
        }
    }

    @Override
    public void perimeter() {
        arrayPerimeter = new double[getArraySize()];
        for (int i = 0; i < getArraySize(); i++) {
            arrayPerimeter[i] = roundOfNumber(2 * PI * circles[i].radius);
            //System.out.println(roundOfNumber(2 * PI * circles[i].r));
        }
    }

    @Override
    public void group() {
        System.out.println((char) 27 + "[34m" + "Index   " + "   x  " + "   y   " + "    Area   " + "     Perimeter " + (char)27 + "[30m " );
        for (int i = 0; i < getArraySize(); i++) {
            if ( - 2 * circles[i].getX() + circles[i].getY() == 3) {


                System.out.print((char)27 + "[35m" + i + (char)27 + "[30m " );
                System.out.print((char)27 + "[35m" + "       " + getX() + "     " + getY() + "     " + (char)27 + "[30m" );
                System.out.println((char)27 + "[35m  " + arrayArea[i] + "     " + arrayPerimeter[i] + (char)27 + "[30m " );
            }
        }
    }

    @Override
    public double maxAreaValue() {
        double arrayAreaMaxElement = arrayArea[0];
        for (int i = 0; i < getArraySize(); i++) {
            if (arrayArea[i] > arrayAreaMaxElement ) {
                arrayAreaMaxElement = arrayArea[i];
            }
        }
        System.out.println((char) 27 + "[34m" + "Maximum value of the area of the circle: " + (char)27 + "[35m" + arrayAreaMaxElement + (char)27 + "[30m" );
        return arrayAreaMaxElement;
    }

    @Override
    public double minAreaValue() {
        double arrayAreaMinElement = arrayArea[0];
        for (int i = 0; i < getArraySize(); i++) {
            if (arrayArea[i] < arrayAreaMinElement ) {
                arrayAreaMinElement = arrayArea[i];
            }
        }
        System.out.println((char) 27 + "[34m" + "Minimum value of the area of the circle: " + (char)27 + "[35m" + arrayAreaMinElement + (char)27 + "[30m" );
        return arrayAreaMinElement;
    }

    @Override
    public double maxPerimeterValue() {
        double arrayPerimeterMaxElement = arrayPerimeter[0];
        for (int i = 0; i < getArraySize(); i++) {
            if (arrayPerimeter[i] > arrayPerimeterMaxElement ) {
                arrayPerimeterMaxElement = arrayPerimeter[i];
            }
        }
        System.out.println((char) 27 + "[34m" + "Maximum value of the perimeter of the circle: " + (char)27 + "[35m" + arrayPerimeterMaxElement + (char)27 + "[30m" );
        return arrayPerimeterMaxElement;
    }

    @Override
    public double minPerimeterValue() {
        double arrayPerimeterMinElement = arrayPerimeter[0];
        for (int i = 0; i < getArraySize(); i++) {
            if (arrayPerimeter[i] < arrayPerimeterMinElement ) {
                arrayPerimeterMinElement = arrayPerimeter[i];
            }
        }
        System.out.println((char) 27 + "[34m" + "Minimum value of the perimeter of the circle: " + (char)27 + "[35m" + arrayPerimeterMinElement + (char)27 + "[30m");
        return arrayPerimeterMinElement;
    }

    private void initializationArrayOfCircle() {
        for (int i = 0; i < arraySize; i++) {
            this.setX(- 5 + (int) (Math.random() * 50));
            this.setY(- 5 + (int) (Math.random() * 50));
            this.radius = 1 + (int) (Math.random() * 20);
            circles[i] = new Circle(getX(), getY(), radius);
        }
    }
}
