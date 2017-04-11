package by.htp.chapter3optionBtask6;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point extends Function implements Movement, RoundOfNumber {

    private double intervalP1 = 0.001;

    public Point() {}

    public Point(double x0, double y0, double z0, double t0) throws NegativeTime {
        super(x0, y0, z0, t0);
    }

    @Override
    public double velocity() {

        double time = getT0();
        double V;

        double Vx, Vy, Vz;
        try {

            if (time < 0) {
                throw new NegativeTime(time);
            }

            firstDerivative(getT0());

        } catch (NegativeTime negativeTime) {
            System.out.println((char) 27 + "[31m" + "The time can not be negative! Please try to enter the time again." + (char)27 + "[30m");
        }

        Vx = getDx()/getDt();
        Vy = getDy()/getDt();
        Vz = getDz()/getDt();

        V = roundOfNumber(sqrt(pow(Vx, 2) + pow(Vy, 2) + pow(Vz, 2)));

        System.out.println((char) 27 + "[34m" + "Velocity : " + (char)27 + "[35m" + V + (char)27 + "[30m");

        return V;
    }

    @Override
    public double acceleration() {

        double time = getT0();
        double a;

        double ax, ay, az;

        try {
            if (time < 0) {
                throw new NegativeTime(time);
            }

            secondDerivative(getT0());

        } catch (NegativeTime negativeTime) {
            System.out.println((char) 27 + "[31m" + "The time can not be negative! Please try to enter the time again." + (char)27 + "[30m");
        }

        ax = getD2x()/getDt();
        ay = getD2y()/getDt();
        az = getD2z()/getDt();

        a = roundOfNumber(sqrt(pow(ax, 2) + pow(ay, 2)+ pow(az, 2)));

        System.out.println((char) 27 + "[34m" + "Acceleration: " + (char)27 + "[35m" + a + (char)27 + "[30m");
        System.out.println();

        return a;
    }

    public boolean isIntersectionTrajectories(Point p) {

        boolean intersection = false;
        int n = (int)(getT0()/intervalP1);
        int m = (int)(p.getT0()/intervalP1);

        double[] point1X = new double[n];
        double[] point1Y = new double[n];
        double[] point1Z = new double[n];

        double[] point2X = new double[m];
        double[] point2Y = new double[m];
        double[] point2Z = new double[m];

        for (int i = 0; i < n; i++) {
            functionDeclaration(intervalP1 * i);
            point1X[i] = roundOfNumber(getX());
            point1Y[i] = roundOfNumber(getY());
            point1Z[i] = roundOfNumber(getZ());
        }
        for (int i = 0; i < m; i++) {
            p.functionDeclaration(intervalP1 * i);
            point2X[i] = roundOfNumber(p.getX());
            point2Y[i] = roundOfNumber(p.getY());
            point2Z[i] = roundOfNumber(p.getZ());
        }
        for (int i = 0; i < n; i++) {
            functionDeclaration(intervalP1 * i);
            for (int j = 0; j < m; j++) {
                p.functionDeclaration(intervalP1 * i);
                if (point1X[i] == point2X[j] && point1Y[i] == point2Y[j] /*&& point1Z[i] == point2Z[j]*/) {

                    System.out.println((char) 27 + "[34m" + "Point of intersection of two trajectories: "
                            + (char)27 + "[35m" + point1X[i] + " : " + point1Y[i] + " : " + point1Z[i]
                            + (char)27 + "[30m");

                    intersection = true;
                }
            }
        }
        if (!intersection) {
            System.out.println((char) 27 + "[31m" + "No points of intersection trajectories." + (char)27 + "[30m");
        }
        System.out.println();
        return intersection;
    }

    public double distance(Point p, double t) {

        double distance = roundOfNumber(
                sqrt(pow(p.getX() - getX(), 2) +
                     pow(p.getY() - getY(), 2) +
                     pow(p.getZ() - getZ(), 2)));

        if (t < 0 || getT0() < 0 || p.getT0() < 0) {
            distance = 0;
        }

        System.out.println((char) 27 + "[34m" + "Distance between points: " + (char)27 + "[35m" + distance + (char)27 + "[30m");

        return distance;
    }
}
