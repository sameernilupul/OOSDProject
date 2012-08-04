/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import java.util.ArrayList;

/**
 *
 * @author wijebandara
 */
public class Decision {

    private boolean approed;
    private String description;
    private java.util.ArrayList<Integer> suggestedLocationIds;

    /**
     *
     * @param suggestedLocationIds
     */
    public void setSuggestedLocationIds(ArrayList<Integer> suggestedLocationIds) {
        this.suggestedLocationIds = suggestedLocationIds;
    }

    /**
     *
     */
    public Decision() {
        suggestedLocationIds = new java.util.ArrayList<Integer>();
    }

    /**
     *
     * @param approed
     */
    public Decision(boolean approed) {
        this.approed = approed;
    }

    /**
     * @return the approed
     */
    public boolean isApproed() {
        return approed;
    }

    /**
     * @param approed the approed to set
     */
    public void setApproed(boolean approed) {
        this.approed = approed;
    }

    /**
     * @return the sujuesedLocationId
     */
    public java.util.ArrayList<Integer> getsuggestedLocationIds() {
        return suggestedLocationIds;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
