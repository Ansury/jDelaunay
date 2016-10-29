package model;

/**
 *
 * @author lou
 */
public class Vector2d {

    public double x;
    public double y;

    public Vector2d() {
    }

    public Vector2d(Vector2d p) {

        this.x = p.x;
        this.y = p.y;
    }

    public Vector2d(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public final void set(Vector2d p) {

        this.x = p.x;
        this.y = p.y;
    }

    public void normalize() {

        double length = x * x + y * y;

        if (length != 1f && length != 0f) {

            length = 1.0d / Math.sqrt(length);
            x = x * length;
            y = y * length;
        }
    }

    public void scale(double scalar) {

        x = x * scalar;
        y = y * scalar;
    }
}
