/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

/**
 *
 * @author wijebandara
 */
public class FactoryRequest extends LandRequest {

    private float enitedCO2;//per day g
    private float area;
    private float emitedCO;//per day g
    private float polutedWater; //per day m3  

    /**
     *
     * @param enitedCO2
     * @param area
     * @param emitedCO
     * @param polutedWater
     * @param userId
     * @param userEmail
     * @param locationId
     * @param title
     * @param discription
     */
    public FactoryRequest(float enitedCO2, float area, float emitedCO, float polutedWater, int userId, String userEmail, int locationId, String title, String discription) {
        super(userId, userEmail, locationId, title, discription);
        this.enitedCO2 = enitedCO2;
        this.area = area;
        this.emitedCO = emitedCO;
        this.polutedWater = polutedWater;
    }

    /**
     *
     */
    public FactoryRequest() {
    }

    /**
     * @return the enitedCO2
     */
    public float getEnitedCO2() {
        return enitedCO2;
    }

    /**
     * @param enitedCO2 the enitedCO2 to set
     */
    public void setEnitedCO2(float enitedCO2) {
        this.enitedCO2 = enitedCO2;
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
     * @return the emitedCO
     */
    public float getEmitedCO() {
        return emitedCO;
    }

    /**
     * @param emitedCO the emitedCO to set
     */
    public void setEmitedCO(float emitedCO) {
        this.emitedCO = emitedCO;
    }

    /**
     * @return the polutedWater
     */
    public float getPolutedWater() {
        return polutedWater;
    }

    /**
     * @param polutedWater the polutedWater to set
     */
    public void setPolutedWater(float polutedWater) {
        this.polutedWater = polutedWater;
    }
}
