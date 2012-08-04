/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package update;

import database.DataBaseHandler;
import location.Point;
import system.Predict;

/**
 *
 * @author wijebandara
 */
public class UpdateHandler {

    private Point position;
    private int locationID;
    private String name;
    private String dataEnteredBy;
    private String date;
    private float CO2_concentration;
    private float O2_concentration;
    private float dustLevel;
    private float airQualityLevel;
    private String waterType;
    private float percentage;
    private float waterQualityIndex;
    private float populationDensity;
    private float greenPercentage;
    private float building;
    private int userId;

    /**
     *
     */
    public UpdateHandler() {
    }

    /**
     *
     * @param state
     */
    public void finish(boolean state) {
        DataBaseHandler db = new DataBaseHandler();
        if (state) {
            if (name == null) {
                db.insertLocation(locationID, (float) position.getX(), (float) position.getY());
            } else {
                db.insertLocation(locationID, name, (float) position.getX(), (float) position.getY());
            }
            db.insertAir(getUserId(), locationID, CO2_concentration, O2_concentration, dustLevel, airQualityLevel);
            db.insertWater(userId, locationID, waterType, percentage, waterQualityIndex);
            db.insertLand(userId, locationID, populationDensity, greenPercentage, building);
        }
        Predict.doPredict(locationID);
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * @param locationID the locationID to set
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param dataEnteredBy the dataEnteredBy to set
     */
    public void setDataEnteredBy(String dataEnteredBy) {
        this.dataEnteredBy = dataEnteredBy;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @param CO2_concentration the CO2_concentration to set
     */
    public void setCO2_concentration(float CO2_concentration) {
        this.CO2_concentration = CO2_concentration;
    }

    /**
     * @param O2_concentration the O2_concentration to set
     */
    public void setO2_concentration(float O2_concentration) {
        this.O2_concentration = O2_concentration;
    }

    /**
     * @param dustLevel the dustLevel to set
     */
    public void setDustLevel(float dustLevel) {
        this.dustLevel = dustLevel;
    }

    /**
     * @param airQualityLevel the airQualityLevel to set
     */
    public void setAirQualityLevel(float airQualityLevel) {
        this.airQualityLevel = airQualityLevel;
    }

    /**
     * @param waterType the waterType to set
     */
    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    /**
     * @param waterQualityIndex the waterQualityIndex to set
     */
    public void setWaterQualityIndex(float waterQualityIndex) {
        this.waterQualityIndex = waterQualityIndex;
    }

    /**
     * @param populationDensity the populationDensity to set
     */
    public void setPopulationDensity(float populationDensity) {
        this.populationDensity = populationDensity;
    }

    /**
     * @param greenPercentage the greenPercentage to set
     */
    public void setGreenPercentage(float greenPercentage) {
        this.greenPercentage = greenPercentage;
    }

    /**
     * @param building the building to set
     */
    public void setBuilding(float building) {
        this.building = building;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
