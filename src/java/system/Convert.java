/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import location.Point;

/**
 *
 * @author wijebandara
 */
public class Convert {

    /**
     *
     * @param point
     * @return
     */
    public static int getLocationId(Point point) {
        if (point.getX() < 5 || point.getX() > 10 || point.getY() < 79 || point.getY() > 82) {
            return 0;
        }
        int x = (int) ((point.getX() - 5) * 1000);
        int y = (int) ((point.getY() - 79) * 1000);

        return 3000 * x + y + 1;
    }

    /**
     *
     * @param locationId
     * @return
     */
    public static Point getPoint(int locationId) {
        int y = (locationId - 1) % 3000;
        int x = (locationId - y - 1) / 3000;

        return new Point(((double) x / 1000) + 5, ((double) y / 1000) + 79);
    }
}
