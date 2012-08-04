/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

/**
 *
 * @author wijebandara
 */
public class Person {

    /**
     *
     */
    private String name;
    /**
     *
     */
    private String userName;
    /**
     *
     */
    private int userId;
    /**
     *
     */
    private String NIC;
    /**
     *
     */
    private String mobileNo;
    /**
     *
     */
    private String email;
    /**
     *
     */
    private int acsessLevel;

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
    public Person(String name, String userName, int userId, String NIC, String mobileNo, String email, int acsessLevel) {
        this.name = name;
        this.userName = userName;
        this.userId = userId;
        this.NIC = NIC;
        this.mobileNo = mobileNo;
        this.email = email;
        this.acsessLevel = acsessLevel;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the acsessLevel
     */
    public int getAcsessLevel() {
        return acsessLevel;
    }

    /**
     * @param acsessLevel the acsessLevel to set
     */
    public void setAcsessLevel(int acsessLevel) {
        this.acsessLevel = acsessLevel;
    }
}