/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import database.DataBaseHandler;
import human.User;
import java.util.ArrayList;
import location.Point;
import request.LandRequest;
import urlgenerator.BasicMap;

/**
 *
 * @author wijebandara
 */
public class LandRequestFeedbackSender {

    /**
     *
     * @param landRequest
     */
    public static void sendFeedback(LandRequest landRequest) {
        DataBaseHandler db = new DataBaseHandler();
        User user = db.getUser(landRequest.getuserId());
        String body = "Dear " + user.getName() + ",\n\t";

        body += "Following link is your requested location.\n\n";

        Point location = system.Convert.getPoint(landRequest.getLocationId());
        urlgenerator.BasicMap bm = new BasicMap((short) 10, 600, 600, true, location.getX(), location.getY());

        body += bm.addPoint(location.getX(), location.getY());

        body += "\n";

        if (landRequest.getSystemDecision().isApproed()) {
            body += "We are happy to inform you that your request has been approved.";
        } else {
            body += "We are sorry to inform you that your request has been rejected due to some certain facts.";

            body += "\n";
            body += landRequest.getSystemDecision().getDescription();
            body += "\n\n";

            body += "Following link is the suggested location.\n\n";

            ArrayList<Point> list = new ArrayList<Point>();
            ArrayList<Integer> suggests;

            suggests = landRequest.getSystemDecision().getsuggestedLocationIds();

            System.out.println(suggests.isEmpty());
            for (int i = 0; i < suggests.size(); i++) {
                list.add(system.Convert.getPoint(suggests.get(i)));
            }

            body += "\n" + bm.addPoints(list);
        }

        SendFeedback.sendMail(landRequest.getUserEmail(), landRequest.getTitle(), body);
    }
}
