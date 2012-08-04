/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import database.DataBaseHandler;
import system.DecisionMaker;

/**
 *
 * @author wijebandara
 */
public class FactoryRequestHandler {

    FactoryRequest factoryRequest;
    DataBaseHandler db;

    /**
     *
     * @param enitedCO2
     * @param area
     * @param discription
     * @param emitedCO
     * @param polutedWater
     * @param userEmail
     * @param userId
     * @param locationId
     * @param title
     */
    public FactoryRequestHandler(float enitedCO2, float area, float emitedCO, float polutedWater, int userId, String userEmail, int locationId, String title, String discription) {
        db = new DataBaseHandler();
        factoryRequest = new FactoryRequest(enitedCO2, area, emitedCO, polutedWater, userId, userEmail, locationId, title, discription);
        db.InsertfactoryRequest(factoryRequest);
    }

    /**
     *
     * @param state
     */
    public void finish(boolean state) {
        System.out.println(factoryRequest.getLocationId());
        Decision decision = DecisionMaker.makeDecision(factoryRequest);

        factoryRequest.setSystemDecision(decision);

        system.LandRequestFeedbackSender.sendFeedback(factoryRequest);
        db.InsertDecision(factoryRequest.getRequestId(), decision, "fact");

        system.LandRequestFeedbackSender.sendFeedback(factoryRequest);
    }
}
