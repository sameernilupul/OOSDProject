/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

/**
 *
 * @author wijebandara
 */
public class AgricultureRequest extends LandRequest {

    private boolean longTime;
    private float area;
    private boolean organic;

    /**
     *
     * @param longTime
     * @param area
     * @param organic
     * @param userId
     * @param userEmail
     * @param locationId
     * @param title
     * @param discription
     */
    public AgricultureRequest(boolean longTime, float area, boolean organic, int userId, String userEmail, int locationId, String title, String discription) {
        super(userId, userEmail, locationId, title, discription);
        this.longTime = longTime;
        this.area = area;
        this.organic = organic;
    }

    /**
     *
     */
    public AgricultureRequest() {
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * @return the longTime
     */
    public boolean isLongTime() {
        return longTime;
    }

    /**
     * @param longTime the longTime to set
     */
    public void setLongTime(boolean longTime) {
        this.longTime = longTime;
    }

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @return the organic
     */
    public boolean isOrganic() {
        return organic;
    }

    /**
     * @param organic the organic to set
     */
    public void setOrganic(boolean organic) {
        this.organic = organic;
    }
}
