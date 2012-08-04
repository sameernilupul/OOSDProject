/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

/**
 *
 * @author wijebandara
 */
public class Approvel {

    private String title;
    private String discription;
    FinalDecision finalDecision;

    /**
     *
     * @param title
     * @param discription
     */
    public Approvel(String title, String discription) {
        finalDecision = new FinalDecision();
        this.title = title;
        this.discription = discription;
    }

    /**
     *
     */
    public Approvel() {
        finalDecision = new FinalDecision();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the discription
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * @param discription the discription to set
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
