/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package urlgenerator;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import location.Point;
import system.Security;
/**
 * 
 * @author sameernilupul
 */
public class Test {
    
    /**
     * 
     * @param args
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //System.out.println(Security.md5("babaiya"));
        BasicMap b = new BasicMap((short)14,600,600,true,40.711614,-74.012318);
        Point p1 = new Point(40.71614,-74.012318);
        Point p2 = new Point(40.711614,-74.01318);
        Point p3 = new Point(40.71614,-74.02318);
        
        ArrayList<Point> arr = new ArrayList<Point>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        System.out.println(b.addPoint(40.711614,-74.012318));
        System.out.println(b.addPoints(arr));
        
    }
}
