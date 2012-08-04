/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

/**
 *
 * @author wijebandara
 */
public class User extends Person {

    /**
     *
     * @param name
     * @param userName
     * @param userId
     * @param NIC
     * @param mobileNo
     * @param email
     * @param acsessLevel
     */
    public User(String name, String userName, int userId, String NIC, String mobileNo, String email, int acsessLevel) {
        super(name, userName, userId, NIC, mobileNo, email, acsessLevel);
    }
}