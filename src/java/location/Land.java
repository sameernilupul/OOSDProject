/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

/**
 *
 * @author Ujitha
 */
public class Land {

    private float populationDensity;
    private float greenPercentage;
    private float building;

    /**
     *
     * @param populationDensity
     * @param greenPercentage
     * @param building
     */
    public Land(float populationDensity, float greenPercentage, float building) {
        this.populationDensity = populationDensity;
        this.greenPercentage = greenPercentage;
        this.building = building;
    }

    /**
     *
     * @param populationDensity
     */
    public void setPopulationDensity(float populationDensity) {
        this.populationDensity = populationDensity;
    }

    /**
     *
     * @param greenPercentage
     */
    public void setGreenPercentage(float greenPercentage) {
        this.greenPercentage = greenPercentage;
    }

    /**
     *
     * @param building
     */
    public void setBuilding(float building) {
        this.building = building;
    }

    /**
     *
     * @return
     */
    public float getPopulationDensity() {
        return populationDensity;
    }

    /**
     *
     * @return
     */
    public float getGreenPercentage() {
        return greenPercentage;
    }

    /**
     *
     * @return
     */
    public float getBuilding() {
        return building;
    }
}
