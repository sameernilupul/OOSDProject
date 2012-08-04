/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

import request.Approvel;

/**
 *
 * @author wijebandara
 */
public class Manager extends Person {

    /**
     *
     */
    protected String type;
    java.util.ArrayList<Approvel> requests;

    /**
     *
     * @param type
     * @param name
     * @param userName
     * @param userId
     * @param NIC
     * @param mobileNo
     * @param email
     * @param acsessLevel
     */
    public Manager(String type, String name, String userName, int userId, String NIC, String mobileNo, String email, int acsessLevel) {
        super(name, userName, userId, NIC, mobileNo, email, acsessLevel);
        this.type = type;
        requests = new java.util.ArrayList<Approvel>();
    }
}
