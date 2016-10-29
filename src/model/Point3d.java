package model;

/**
 *
 * @author lou
 */
public class Point3d {

    private double x;
    private double y;
    private double z;

    public Point3d() {
    }

    public Point3d(Point3d p) {

        set(p);
    }

    public Point3d(double x, double y, double z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public final void set(Point3d p) {

        this.x = p.x;
        this.y = p.y;
        this.z = p.z;
    }
}
