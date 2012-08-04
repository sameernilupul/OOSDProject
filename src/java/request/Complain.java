/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import java.util.LinkedList;
import location.Point;

/**
 *
 * @author wijebandara
 */
public class Complain extends Approvel {

    private String userEmail;
    private int complainId;
    private Point location;

    /**
     *
     * @param userEmail
     * @param complainId
     * @param location
     */
    public Complain(String userEmail, int complainId, Point location) {
        this.userEmail = userEmail;
        this.complainId = complainId;
        this.location = location;
    }

    /**
     *
     * @param userEmail
     * @param complainId
     * @param location
     * @param title
     * @param discription
     */
    public Complain(String userEmail, int complainId, Point location, String title, String discription) {
        super(title, discription);
        this.userEmail = userEmail;
        this.complainId = complainId;

        this.location = location;
    }

    /**
     *
     * @param userEmail
     * @param location
     * @param title
     * @param discription
     */
    public Complain(String userEmail, Point location, String title, String discription) {
        super(title, discription);
        this.userEmail = userEmail;
        this.location = location;
    }

    /**
     *
     */
    public Complain() {
    }

    /**
     * @return the userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail the userEmail to set
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return the complainId
     */
    public int getComplainId() {
        return complainId;
    }

    /**
     * @param complainId the complainId to set
     */
    public void setComplainId(int complainId) {
        this.complainId = complainId;
    }

    /**
     * @return the location
     */
    public Point getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Point location) {
        this.location = location;
    }
}