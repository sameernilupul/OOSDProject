/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import request.Complain;

/**
 *
 * @author wijebandara
 */
public class ComplainFeedback {

    /**
     *
     * @param complain
     */
    public static void sendFeedback(Complain complain) {
        String body = "Dear Sir/Madam ,\n\t Thank you for your complain , we will concern about it and will take immediate action. Your identity will be confidential with us. Thank you very much and hope you will give us fullest cooperation further.  ";

        system.SendFeedback.sendMail(complain.getUserEmail(), "Feedback to your complain", body);
    }
}
