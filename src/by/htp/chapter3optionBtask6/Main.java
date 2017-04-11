package by.htp.chapter3optionBtask6;

public class Main {
    public static void main(String[] args) {

        Point p1 = null;
        Point p2 = null;

        try {
            p1 = new Point(1, 1, -5, 2);
            p2 = new Point(-1, -1, -1, 4);
        } catch (NegativeTime time) {}

        p1.velocity();
        p1.acceleration();

        p2.velocity();
        p2.acceleration();

        p1.isIntersectionTrajectories(p2);

        p1.distance(p2, 6);
    }
}
