package model;

/**
 *
 * @author lou
 */
public class Point2d {

    public double x;
    public double y;

    public Point2d() {
    }

    public Point2d(Point2d p) {

        this.x = p.x;
        this.y = p.y;
    }

    public Point2d(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public final void set(Point2d p) {

        this.x = p.x;
        this.y = p.y;
    }

    public double distanceSquared(Point2d v) {

        double dx = x - v.x;
        double dy = y - v.y;
        return dx * dx + dy * dy;
    }
}
