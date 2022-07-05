package pl.sda.oop_homework;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point firstPoint, Point secondPoint) {
        this.point1 = firstPoint;
        this.point2 = secondPoint;
    }

    public double getDistance() {
        return sqrt(
                pow(point2.getX() - point1.getX(), 2) +
                        pow(point2.getY() - point1.getY(), 2));
    }
}
