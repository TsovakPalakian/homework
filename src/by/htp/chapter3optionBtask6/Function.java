package by.htp.chapter3optionBtask6;

import static java.lang.Math.*;

public abstract class Function {

    private double x, y, z;
    private double dx, dy, dz;
    private double d2x, d2y, d2z;

    private double x0, y0, z0, t0;

    private final static double dt = 0.00001;

    public Function() {}

    public Function (double x0, double y0, double z0, double t0) throws NegativeTime {
        this.x0 = x0;
        this.y0 = y0;
        this.z0 = z0;
        this.t0 = t0;
        try {
            if (t0 < 0) {
                throw new NegativeTime(t0);
            }

        } catch (NegativeTime e) {

        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public double getDz() {
        return dz;
    }

    public void setDz(double dz) {
        this.dz = dz;
    }

    public double getD2x() {
        return d2x;
    }

    public void setD2x(double d2x) {
        this.d2x = d2x;
    }

    public double getD2y() {
        return d2y;
    }

    public void setD2y(double d2y) {
        this.d2y = d2y;
    }

    public double getD2z() {
        return d2z;
    }

    public void setD2z(double d2z) {
        this.d2z = d2z;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getY0() {
        return y0;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }

    public double getZ0() {
        return z0;
    }

    public void setZ0(double z0) {
        this.z0 = z0;
    }

    public double getT0() {
        return t0;
    }

    public void setT0(double t0) {
        this.t0 = t0;
    }

    public static double getDt() {
        return dt;
    }

    protected void functionDeclaration(double t) {
        this.x = x0 + pow(t, 1) + pow(t, 2);
        this.y = y0 - 2 * pow(t, 1) + 4 * pow(t, 2);
        this.z = z0 - pow(t, 1) + pow(t, 3);
    }
    protected void firstDerivative(double t)  {
        this.dx = ( pow(t + dt, 1) + pow(t + dt, 2) ) - ( pow(t, 1) + pow(t, 2) );
        this.dy = ( - 2 * pow(t + dt, 1) + 4 * pow(t + dt, 2) ) - ( - 2 * pow(t, 1) + 4 * pow(t, 2) );
        this.dz = ( - pow(t + dt, 1) + pow(t + dt, 3) ) - ( - pow(t, 1) + pow(t, 3) );
    }
    protected void secondDerivative(double t) {
        this.d2x = ( 2 * pow(t + dt, 1) ) - ( 2 * pow(t, 1) );
        this.d2y = ( 8 * pow(t + dt, 1) ) - ( 8 * pow(t, 1) );
        this.d2z = ( 3 * pow(t + dt, 2) ) - ( 3 * pow(t, 2) );
    }
}
