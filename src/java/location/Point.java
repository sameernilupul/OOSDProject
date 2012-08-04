/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

/**
 *
 * @author wijebandara
 */
public class Point {

    private double x, y;

    /**
     *
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     */
    public Point() {
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     *
     * @param x
     * @param y
     */
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }
}