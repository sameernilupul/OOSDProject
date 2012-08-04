/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author sameernilupul
 */
public class AddUserFeedback {
    
    public static void sendMail(String email,String name,String userName,String passwd,String url)
    {
        String body ="Dear ";
        body+=name;
        body+=",\n\t Congragulations! You have been registered successfully.";
        body+="\n\nYour user name : "+userName+"\n";
        body+="Your password : " +passwd+"\n\n";
        body+="Go to following link to change your password\n"+url+"\n\n"; 
        
        system.SendFeedback.sendMail(email, "Confirmation E-Mail", body);
    }
    public static void sendMail(String email,String name,String userName,String passwd,String type,String url)
    {
        String body ="Dear ";
        body+=name;
        body+=",\n\t Congragulations! You have been selected as a "+type+".";
        
        body+="\n\nYour user name : "+userName+"\n";
        body+="Your password : " +passwd+"\n\n";
        
        body+="Go to following link to change your password\n"+url+"\n\n";
      system.SendFeedback.sendMail(email, "Confirmation E-Mail", body);

    }
    
}
