/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

/**
 *
 * @author Ujitha
 */
public class Water {

    private String waterType;
    private float percentage;
    private float waterQualityIndex;

    /**
     *
     * @param waterType
     * @param percentage
     * @param waterQualityIndex
     */
    public Water(String waterType, float percentage, float waterQualityIndex) {
        this.waterType = waterType;
        this.waterQualityIndex = waterQualityIndex;
        this.percentage = percentage;

    }

    Water() {
    }

    /**
     *
     * @param waterType
     */
    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    /**
     *
     * @param percentage
     */
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    /**
     *
     * @param waterQualityIndex
     */
    public void setWaterQualityIndex(float waterQualityIndex) {
        this.waterQualityIndex = waterQualityIndex;
    }

    /**
     *
     * @return
     */
    public String getWaterType() {
        return waterType;
    }

    /**
     *
     * @return
     */
    public float getPercentage() {
        return percentage;
    }

    /**
     *
     * @return
     */
    public float getWaterQualityIndex() {
        return waterQualityIndex;
    }
}
