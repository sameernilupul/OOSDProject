/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

/**
 *
 * @author wijebandara
 */
public class LandRequest extends Approvel
{
    private  int userId;
    private  String userEmail;
    private  int requestId;
    private  int locationId;

    /**
     * 
     * @param userId
     * @param userEmail
     * @param locationId
     * @param title
     * @param discription
     */
    public LandRequest(int userId, String userEmail,int locationId, String title, String discription) {
        super(title, discription);
        this.userId = userId;
        this.userEmail = userEmail;
        this.locationId = locationId;
        this.systemDecision = new Decision();
    }
    private  Decision systemDecision;



    /**
     * 
     */
    public LandRequest() {
    }

    /**
     * @return the userId
     */
    public int getuserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setuserId(int userId) {
        this.userId = userId;
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
     * @return the requestId
     */
    public int getRequestId() {
        return requestId;
    }

    /**
     * @param requestId the requestId to set
     */
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }


    /**
     * @return the locationId
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * @param locationId the locationId to set
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    /**
     * @return the systemDecision
     */
    public Decision getSystemDecision() {
        return systemDecision;
    }

    /**
     * @param systemDecision the systemDecision to set
     */
    public void setSystemDecision(Decision systemDecision) {
        this.systemDecision = systemDecision;
    }
    

}

