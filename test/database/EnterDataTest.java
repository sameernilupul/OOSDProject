/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import location.Location;
import location.Point;

/**
 *
 * @author sameernilupul
 */
public class EnterDataTest
{
    public static void main(String[] args) {
        DataBaseHandler db =new DataBaseHandler();
        
        Location l=new Location();
        Point p;
        for(int i=130402;i<15000000;i++)
        {
            p=system.Convert.getPoint(i);
            db.insertLocation(i,"NotFound", (float)p.getX(),(float)p.getY());
            db.insertAir(0, i, (float)Math.random()*100, (float)Math.random()*100,(float)Math.random()*100,(float) Math.random()*100);
            db.insertLand(0, i, (float)Math.random()*100, (float)Math.random()*100, (float)Math.random()*100);
            db.insertWater(0, i, "NotFound", (float)Math.random()*100,(float) Math.random()*100);
        }
    }
}
