/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import database.DataBaseHandler;
import location.Air;
import location.Land;
import location.Water;
import request.AgricultureRequest;
import request.Decision;
import request.DomesticRequest;
import request.FactoryRequest;

/**
 *
 * @author wijebandara
 */
public class DecisionMaker {

    /**
     *
     * @param factoryRequest
     * @return
     */
    public static Decision makeDecision(FactoryRequest factoryRequest) {
        DataBaseHandler db = new DataBaseHandler();
        Decision systemDecision;
        Land land = db.getLand(factoryRequest.getLocationId());
        Water water = db.getWater(factoryRequest.getLocationId());
        Air air = db.getAir(factoryRequest.getLocationId());

        if (land.getBuilding() + factoryRequest.getArea() > Math.pow(10, 7)) {
            systemDecision = new Decision(false);
            systemDecision.setSuggestedLocationIds(suggestLocations(db, factoryRequest.getLocationId()));
            return systemDecision;

        }
        if (land.getGreenPercentage() > 90) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nReserved forest.\nThe land you requestted is named as a resrved forest.So this land cannot be approved for construction or any business purpose.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, factoryRequest.getLocationId()));
            return systemDecision;
        }
        if (land.getGreenPercentage() < 10) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nHigh urbanized area.\nThe land you requested is a high populated area.\nSo this land cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, factoryRequest.getLocationId()));
            return systemDecision;

        }
        /*
         * http://www.tradingeconomics.com/sri-lanka/population-density-people-per-sq-km-wb-data.html
         *
         */
        if (land.getPopulationDensity() > 250) {

            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nHigh urbanized area.\nThe land you requested is a high populated area.\nSo this land cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, factoryRequest.getLocationId()));
            return systemDecision;
        }
        /*
         * http://www.water-research.net/watrqualindex/index.htm
         */
        if (water.getWaterQualityIndex() > 90) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nFresh water fountain.\nThe land you requested contains rare fresh water fountains.\nSo this land cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, factoryRequest.getLocationId()));
            return systemDecision;
        }
        /*
         * http://en.wikipedia.org/wiki/Carbon_dioxide_in_Earth's_atmosphere
         *
         * ppmv
         */
        if (air.getCO2_concentration() < 350 && air.getDustLevel() < 10) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nForest.\nThe land you requested is named as a forst.\nSo this land cannot be approved for construction or any business purpose.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, factoryRequest.getLocationId()));
            return systemDecision;
        }
        if (factoryRequest.getEmitedCO() > 300) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nCO emission of your factory is very high.\nThis requested cannot be approved.\nYou can make solutions to reduce your C0 emmision and make your requst again. ");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, factoryRequest.getLocationId()));
            return systemDecision;
        }
        if (factoryRequest.getEnitedCO2() > 500) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nCO2 emission of your factory is very high.\nThis requested cannot be approved.\nYou can make solutions to reduce your C02 emmision and make your requst again. ");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, factoryRequest.getLocationId()));
            return systemDecision;
        }
        if (factoryRequest.getPolutedWater() > 100) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nThe polluted water disposal of your factory is very high.\nThis request cannot be approved.");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, factoryRequest.getLocationId()));
            return systemDecision;
        }
        systemDecision = new Decision(true);
        systemDecision.setDescription("\n\nThere are no issues regarding your requst.\nMaintain your CO,CO2,polluted water concntration disposal carefully.");
        return systemDecision;
    }

    private static java.util.ArrayList<Integer> suggestLocations(DataBaseHandler db, int givenLocationId) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        Land land;
        Water water;
        Air air;

        int i = givenLocationId - 50 - 150000;
        if (i < 1) {
            i = 1;
        }
        for (int j = 0; j < 100; j++) {

            for (int k = 0; k < 100; k++) {

                land = db.getLand(i);
                water = db.getWater(i);
                air = db.getAir(i);

                if (land != null && water != null && air != null && land.getGreenPercentage() < 60 && land.getGreenPercentage() > 20 && land.getPopulationDensity() < 250 && air.getO2_concentration() < 250 && air.getDustLevel() < 50 && water.getWaterQualityIndex() < 50) {
                    list.add(i);
                }
                i++;
            }
            i += 2800;
        }

        if (list.isEmpty()) {
            int hold = (int) (Math.random() * 100);
            list.add(givenLocationId + hold + 3000);
            list.add(givenLocationId - hold - 3000 - 30);
            list.add(givenLocationId + hold);

        }
        return list;
    }

    /**
     *
     * @param domesticRequest
     * @return
     */
    public static Decision makeDecision(DomesticRequest domesticRequest) {
        DataBaseHandler db = new DataBaseHandler();
        Decision systemDecision;
        Land land = db.getLand(domesticRequest.getLocationId());
        Water water = db.getWater(domesticRequest.getLocationId());
        Air air = db.getAir(domesticRequest.getLocationId());

        if (land.getBuilding() + domesticRequest.getArea() > Math.pow(10, 7)) {
            systemDecision = new Decision(false);
            systemDecision.setSuggestedLocationIds(suggestLocations(db, domesticRequest.getLocationId()));
            return systemDecision;

        }
        if (land.getGreenPercentage() > 90) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nReserved forest.\nThe land you requested is named as a resrved forst.So this land cannot be approved for constructions.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, domesticRequest.getLocationId()));
            return systemDecision;
        }
        if (land.getGreenPercentage() < 10) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nHigh urbanized area.\nThe land you requested is a high populated area.\nSo this land cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, domesticRequest.getLocationId()));
            return systemDecision;

        }
        /*
         * http://www.tradingeconomics.com/sri-lanka/population-density-people-per-sq-km-wb-data.html
         *
         */
        if (land.getPopulationDensity() > 250) {

            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nHigh urbanized area.\nThe land you requested is a high populated area.\nSo this land cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, domesticRequest.getLocationId()));
            return systemDecision;
        }
        /*
         * http://www.water-research.net/watrqualindex/index.htm
         */
        if (water.getWaterQualityIndex() > 90) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nFresh water fountain.\nThe land you requested contains rare fresh water fountains.\nSo this land cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, domesticRequest.getLocationId()));
            return systemDecision;
        }
        /*
         * http://en.wikipedia.org/wiki/Carbon_dioxide_in_Earth's_atmosphere
         *
         * ppmv
         */
        if (air.getCO2_concentration() < 350 && air.getDustLevel() < 10) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nForest.\nThe land you requestted is named as a forest.\nSo this land cannot be approved for construction or any business purpose.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, domesticRequest.getLocationId()));
            return systemDecision;
        }

        if (domesticRequest.getArea() * domesticRequest.getNoOfFloor() < domesticRequest.getNoOfOccupans() * 20) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nThe construction is uncomfertable.\nWe do not recommend this type of a domestic construction regarding health and other issues.\nThis construction cannot be approved.");
            return systemDecision;
        }
        systemDecision = new Decision(true);
        systemDecision.setDescription("\n\nThere are no issues regarding your requst.\nThe requsted land is suitable for a domestic construction. ");
        return systemDecision;
    }

    /**
     *
     * @param agricultureRequest
     * @return
     */
    public static Decision makeDecision(AgricultureRequest agricultureRequest) {

        DataBaseHandler db = new DataBaseHandler();
        Decision systemDecision;
        Land land = db.getLand(agricultureRequest.getLocationId());
        Water water = db.getWater(agricultureRequest.getLocationId());
        Air air = db.getAir(agricultureRequest.getLocationId());


        if (land.getBuilding() + agricultureRequest.getArea() > Math.pow(10, 7)) {
            systemDecision = new Decision(false);
            systemDecision.setSuggestedLocationIds(suggestLocations(db, agricultureRequest.getLocationId()));
            return systemDecision;

        }
        if (land.getGreenPercentage() > 90) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nReserved forest.\nThis land cannot be released for any crops or any agricultural process.\nSo this request cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, agricultureRequest.getLocationId()));
            return systemDecision;
        }
        if (land.getGreenPercentage() < 10) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nHigh urbanized area.\nThis land is very poppulated area and cannot be allowed to do any kind of agricultural construction or crops.\nSo this request cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, agricultureRequest.getLocationId()));
            return systemDecision;

        }
        /*
         * http://www.tradingeconomics.com/sri-lanka/population-density-people-per-sq-km-wb-data.html
         *
         */
        if (land.getPopulationDensity() > 250) {

            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nHigh urbanized area.\nThis land is very poppulated area and cannot be allowed to do any kind of agricultural construction or crops.\nSo this request cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, agricultureRequest.getLocationId()));
            return systemDecision;
        }
        /*
         * http://www.water-research.net/watrqualindex/index.htm
         */
        if (water.getWaterQualityIndex() > 90) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nFresh water fountain.\nThe land you requested contains rare fresh water fountains.\nSo this land cannot be approved.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, agricultureRequest.getLocationId()));
            return systemDecision;
        }
        /*
         * http://en.wikipedia.org/wiki/Carbon_dioxide_in_Earth's_atmosphere
         *
         * ppmv
         */
        if (air.getCO2_concentration() < 350 && air.getDustLevel() < 10) {
            systemDecision = new Decision(false);
            systemDecision.setDescription("\n\nForest.\nThe land you requested is named as a forest.\nSo this land cannot be approved for construction or any business purpose.\nYou can get help from the ministry to find a suitable land");
            systemDecision.setSuggestedLocationIds(suggestLocations(db, agricultureRequest.getLocationId()));
            return systemDecision;
        }

        systemDecision = new Decision(true);
        systemDecision.setDescription("\n\nThere are no issues rgarding your rquest.\nThis land is suitable for agricultural purposes.");
        return systemDecision;

    }
}
