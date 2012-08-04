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
public class DomesticRequestHandler {

    DataBaseHandler db;
    DomesticRequest domesticRequest;

    /**
     *
     * @param area
     * @param noOfFloor
     * @param noOfOccupans
     * @param discription
     * @param userEmail
     * @param userId
     * @param locationId
     * @param title
     */
    public DomesticRequestHandler(float area, int noOfFloor, int noOfOccupans, int userId, String userEmail, int locationId, String title, String discription) {
        domesticRequest = new DomesticRequest(area, noOfFloor, noOfOccupans, userId, userEmail, locationId, title, discription);
        db = new DataBaseHandler();
        db.Insertdomesticrequest(domesticRequest);
    }

    /**
     *
     * @param state
     */
    public void finish(boolean state) {
        Decision decision = DecisionMaker.makeDecision(domesticRequest);
        domesticRequest.setSystemDecision(decision);
        system.LandRequestFeedbackSender.sendFeedback(domesticRequest);
        db.InsertDecision(domesticRequest.getRequestId(), decision, "home");

        system.LandRequestFeedbackSender.sendFeedback(domesticRequest);
    }
}
