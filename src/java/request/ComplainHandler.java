/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import database.DataBaseHandler;
import location.Point;

/**
 *
 * @author wijebandara
 */
public class ComplainHandler {

    private DataBaseHandler db;
    private Complain complain;

    /**
     *
     * @param userEmail
     * @param location
     * @param title
     * @param discription
     */
    public ComplainHandler(String userEmail, Point location, String title, String discription) {
        complain = new Complain(userEmail, location, title, discription);
        db = new DataBaseHandler();
    }

    /**
     *
     * @param state
     */
    public void finish(boolean state) {
        system.ComplainFeedback.sendFeedback(complain);
        db.insertComplain(complain.getTitle(), complain.getDiscription(), complain.getUserEmail(), (float) complain.getLocation().getX(), (float) complain.getLocation().getY(), "pending");
    }
}
