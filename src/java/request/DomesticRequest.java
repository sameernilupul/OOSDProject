/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

/**
 *
 * @author wijebandara
 */
public class DomesticRequest extends LandRequest {

    private float area;
    private int noOfFloor;
    private int noOfOccupans;

    /**
     *
     * @param area
     * @param noOfFloor
     * @param noOfOccupans
     * @param userId
     * @param userEmail
     * @param locationId
     * @param title
     * @param discription
     */
    public DomesticRequest(float area, int noOfFloor, int noOfOccupans, int userId, String userEmail, int locationId, String title, String discription) {
        super(userId, userEmail, locationId, title, discription);
        this.area = area;
        this.noOfFloor = noOfFloor;
        this.noOfOccupans = noOfOccupans;
    }

    /**
     *
     */
    public DomesticRequest() {
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
     * @return the noOfFloor
     */
    public int getNoOfFloor() {
        return noOfFloor;
    }

    /**
     * @param noOfFloor the noOfFloor to set
     */
    public void setNoOfFloor(int noOfFloor) {
        this.noOfFloor = noOfFloor;
    }

    /**
     * @return the noOfOccupans
     */
    public int getNoOfOccupans() {
        return noOfOccupans;
    }

    /**
     * @param noOfOccupans the noOfOccupans to set
     */
    public void setNoOfOccupans(int noOfOccupans) {
        this.noOfOccupans = noOfOccupans;
    }
}
