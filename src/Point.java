/**
 * This class represents a simple 2D Point
 */
public class Point {
    public double get_x() {
        return _x;
    }

    public double get_y() {
        return _y;
    }

    private double _x,_y;

    public Point(double x, double y) {
        _x = x;
        _y = y;
    }

}
