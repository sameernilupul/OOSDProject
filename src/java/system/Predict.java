/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import database.DataBaseHandler;
import java.util.ArrayList;
import location.Air;
import location.Land;
import location.Water;

/**
 *
 * @author wijebandara
 */
public class Predict {

    /**
     *
     * @param locationId
     */
    public static void doPredict(int locationId) {
        DataBaseHandler db = new DataBaseHandler();

        ArrayList<Air> airRecords = db.getAllAir(locationId);
        ArrayList<Land> landRecords = db.getAllLand(locationId);
        ArrayList<Water> waterRecodes = db.getAllWater(locationId);

        int n = airRecords.size();

        float waterType[] = new float[n];
        float percentage[] = new float[n];
        float waterQualityIndex[] = new float[n];

        float CO2_concentration[] = new float[n];
        float O2_concentration[] = new float[n];
        float dustLevel[] = new float[n];
        float airQualityLevel[] = new float[n];

        float populationDensity[] = new float[n];
        float greenPercentage[] = new float[n];
        float building[] = new float[n];

        Water water;
        Air air;
        Land land;
        for (int i = 0; i < n; i++) {
            percentage[i] = waterRecodes.get(i).getPercentage();
            waterQualityIndex[i] = waterRecodes.get(i).getWaterQualityIndex();

            CO2_concentration[i] = airRecords.get(i).getCO2_concentration();
            O2_concentration[i] = airRecords.get(i).getO2_concentration();
            dustLevel[i] = airRecords.get(i).getDustLevel();
            airQualityLevel[i] = airRecords.get(i).getAirQualityLevel();

            populationDensity[i] = landRecords.get(i).getPopulationDensity();
            greenPercentage[i] = landRecords.get(i).getGreenPercentage();
            building[i] = landRecords.get(i).getBuilding();

        }


        db.insertAir(-1, locationId, newtonInterpolation(CO2_concentration, n), newtonInterpolation(O2_concentration, n), newtonInterpolation(dustLevel, n), newtonInterpolation(airQualityLevel, n));
        db.insertLand(-1, locationId, newtonInterpolation(populationDensity, n), newtonInterpolation(greenPercentage, n), newtonInterpolation(building, n));
        db.insertWater(-1, locationId, waterRecodes.get(0).getWaterType(), newtonInterpolation(percentage, n), newtonInterpolation(waterQualityIndex, n));
    }

    private static float newtonInterpolation(float data[], int x) {
        float ans = 0;
        for (int i = 0; i < data.length; i++) {
            float hold = calculate_F(data, 0, i);
            int hold1 = 1;
            for (int j = 0; j < i; j++) {
                hold1 *= (x - j);
            }
            ans += hold * hold1;
        }
        return ans;
    }

    private static float calculate_F(float data[], int i, int j) {
        if (i == j) {
            return data[i];
        }
        return (calculate_F(data, i, j - 1) - calculate_F(data, i + 1, j)) / (i - j);
    }
}
