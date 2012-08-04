/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

/**
 *
 * @author Ujitha
 */
public class Air {

    private float CO2_concentration;
    private float O2_concentration;
    private float dustLevel;
    private float airQualityLevel;

    /**
     *
     * @param CO2_concentration
     * @param O2_concentration
     * @param dustLevel
     * @param airQualityLevel
     */
    public Air(float CO2_concentration, float O2_concentration, float dustLevel, float airQualityLevel) {
        this.CO2_concentration = CO2_concentration;
        this.O2_concentration = O2_concentration;
        this.airQualityLevel = airQualityLevel;
        this.dustLevel = dustLevel;
    }

    /**
     *
     * @param CO2_concentration
     */
    public void setCO2_concentration(float CO2_concentration) {
        this.CO2_concentration = CO2_concentration;
    }

    /**
     *
     * @param O2_concentration
     */
    public void setO2_concentration(float O2_concentration) {
        this.O2_concentration = O2_concentration;
    }

    /**
     *
     * @param airQualityLevel
     */
    public void setAirQualityLevel(float airQualityLevel) {
        this.airQualityLevel = airQualityLevel;
    }

    /**
     *
     * @param dustLevel
     */
    public void setDustLevel(float dustLevel) {
        this.dustLevel = dustLevel;
    }

    /**
     *
     * @return
     */
    public float getCO2_concentration() {
        return CO2_concentration;
    }

    /**
     *
     * @return
     */
    public float getO2_concentration() {
        return O2_concentration;
    }

    /**
     *
     * @return
     */
    public float getAirQualityLevel() {
        return airQualityLevel;
    }

    /**
     *
     * @return
     */
    public float getDustLevel() {
        return dustLevel;
    }
}
