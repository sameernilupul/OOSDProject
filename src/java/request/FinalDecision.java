/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

/**
 *
 * @author wijebandara
 */
public class FinalDecision {

    private String feedback;
    private int state;
    private String Discription;

    /**
     *
     */
    public FinalDecision() {
        state = 0;
    }

    /**
     *
     * @param feedback
     * @param state
     * @param Discription
     */
    public FinalDecision(String feedback, int state, String Discription) {
        this.feedback = feedback;
        this.state = state;
        this.Discription = Discription;
    }

    /**
     * @return the feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * @return the Discription
     */
    public String getDiscription() {
        return Discription;
    }

    /**
     * @param Discription the Discription to set
     */
    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }
}
