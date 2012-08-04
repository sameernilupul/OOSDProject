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
public class AgricultureRequestHandler {

    DataBaseHandler db;
    AgricultureRequest agricultureRequest;

    /**
     *
     * @param longTime
     * @param area
     * @param organic
     * @param userId
     * @param userEmail
     * @param locationId
     * @param title
     * @param discription
     */
    public AgricultureRequestHandler(boolean longTime, float area, boolean organic, int userId, String userEmail, int locationId, String title, String discription) {
        agricultureRequest = new AgricultureRequest(longTime, area, organic, userId, userEmail, locationId, title, discription);
        System.out.println(longTime + " " + area + " " + organic + " " + userId + " " + userEmail + " " + locationId + " " + title + " " + discription);
        System.out.println(agricultureRequest.isLongTime() + " " + agricultureRequest.getArea() + " " + agricultureRequest.isOrganic() + " " + agricultureRequest.getuserId() + " " + agricultureRequest.getUserEmail() + " " + agricultureRequest.getLocationId() + " " + agricultureRequest.getTitle() + " " + agricultureRequest.getDiscription());

        db = new DataBaseHandler();
        agricultureRequest.setRequestId(db.Insertagriculturerequest(agricultureRequest));
        System.out.println(agricultureRequest.getRequestId());
    }

    /**
     *
     * @param state
     */
    public void finish(boolean state) {

        Decision decision = DecisionMaker.makeDecision(agricultureRequest);

        agricultureRequest.setSystemDecision(decision);
        system.LandRequestFeedbackSender.sendFeedback(agricultureRequest);
        db.InsertDecision(agricultureRequest.getRequestId(), decision, "agri");
        system.LandRequestFeedbackSender.sendFeedback(agricultureRequest);
    }
}
