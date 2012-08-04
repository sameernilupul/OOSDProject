/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

/**
 *
 * @author Ujitha
 */
public class Location {

    private Point position;
    private int locationID;
    private String name;
    private String dataEnteredBy;
    private String date;
    Water water;
    Air air;
    Land land;

    /**
     *
     * @param position
     * @param locationID
     * @param name
     * @param dataEnteredBy
     * @param date
     * @param water
     * @param air
     * @param land
     */
    public Location(Point position, int locationID, String name, String dataEnteredBy, String date, Water water, Air air, Land land) {
        this.position = position;
        this.locationID = locationID;
        this.name = name;
        this.dataEnteredBy = dataEnteredBy;
        this.date = date;
        this.land = land;
        this.water = water;
        this.air = air;
    }

    /**
     *
     */
    public Location() {
    }

    /**
     *
     * @param position
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     *
     * @param locationID
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param land
     */
    public void setLand(Land land) {
        this.land = land;
    }

    /**
     *
     * @param water
     */
    public void setWater(Water water) {
        this.water = water;
    }

    /**
     *
     * @param air
     */
    public void setAir(Air air) {
        this.air = air;
    }

    /**
     *
     * @return
     */
    public Point getPosition() {
        return position;
    }

    /**
     *
     * @return
     */
    public int getLocationID() {
        return locationID;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public Water getWater() {
        return water;
    }

    /**
     *
     * @return
     */
    public Land getLand() {
        return land;
    }

    /**
     *
     * @return
     */
    public Air getAir() {
        return air;
    }

    /**
     * @return the dataEnteredBy
     */
    public String getDataEnteredBy() {
        return dataEnteredBy;
    }

    /**
     * @param dataEnteredBy the dataEnteredBy to set
     */
    public void setDataEnteredBy(String dataEnteredBy) {
        this.dataEnteredBy = dataEnteredBy;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
}
