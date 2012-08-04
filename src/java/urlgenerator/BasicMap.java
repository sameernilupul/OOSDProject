package urlgenerator;

import java.util.ArrayList;
import location.Point;

/**
 *
 * @author sameernilupul
 */
public class BasicMap {

    /**
     *
     */
    private Point center;
    /**
     *
     */
    private short zoom;
    /**
     *
     */
    private int xSize;
    /**
     *
     */
    private int ySize;
    /**
     *
     */
    private boolean sensor;
    /**
     *
     */
    private String baseUrl = "http://maps.googleapis.com/maps/api/staticmap?";

    /**
     *
     * @param zoom
     * @param xSize
     * @param ySize
     * @param sensor
     * @param longitude
     * @param latitude
     */
    public BasicMap(short zoom, int xSize, int ySize, boolean sensor, double longitude, double latitude) {
        this.center = new Point(longitude, latitude);
        this.zoom = zoom;
        this.xSize = xSize;
        this.ySize = ySize;
        this.sensor = sensor;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return baseUrl + getCenter() + "&" + getZoom() + "&" + getSize() + "&" + getSensor();
    }

    private String getCenter() {
        return "center=" + Double.toString(center.getX()) + "," + Double.toString(center.getY());
    }

    private String getZoom() {
        return "zoom=" + Short.toString(zoom);
    }

    private String getSize() {
        return "size=" + Integer.toString(xSize) + "x" + Integer.toString(ySize);
    }

    private String getSensor() {
        return "sensor=" + Boolean.toString(sensor);
    }

    /**
     *
     * @param longi
     * @param lati
     * @return
     */
    public String addPoint(double longi, double lati) {
        return getUrl() + "&maptype=hybrid" + "&markers=color:red%7Clabel:L%7C" + Double.toString(longi) + "," + Double.toString(lati);
    }

    /**
     *
     * @param list
     * @return
     */
    public String addPoints(ArrayList<Point> list) {
        String url = getUrl() + "&maptype=hybrid";
        for (int i = 0; i < list.size(); i++) {
            Point p = list.get(i);
            url += "&markers=color:red%7Clabel:S%7C" + Double.toString(p.getX()) + "," + Double.toString(p.getY());
        }
        return url;
    }
}
