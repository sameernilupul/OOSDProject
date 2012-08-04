/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

import database.DataBaseHandler;
import request.Approvel;
import request.FinalDecision;

/**
 *
 * @author wijebandara
 */
public class ManagerInterfaceHandler {

    Manager manager;
    java.util.ArrayList<Approvel> requests;
    DataBaseHandler db;

    /**
     *
     * @param userName
     */
    public ManagerInterfaceHandler(String userName) {
        db = new DataBaseHandler();
        manager = db.getManager(userName);
        requests = new java.util.ArrayList<Approvel>();

    }
}
