/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author wijebandara
 */
import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author sameernilupul
 */
public class SendFeedback {

    /**
     *
     * @param to
     * @param titel
     * @param feedback
     */
    public static void sendMail(String to, String titel, String feedback) {

        String from = "slenvironmentmin@gmail.com";
        String subject = titel;
        String message = feedback;
        SendMail sendMail = new SendMail(from, to, subject, message);
        sendMail.send();
    }
}

class SendMail {

    private String from;
    private String to;
    private String subject;
    private String text;

    public SendMail(String from, String to, String subject, String text) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    public void send() {
        String host = "smtp.gmail.com";
        String userid = "slenvironmentmin";
        String password = "wolfpackoosd";
        try {
            Properties props = System.getProperties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.setProperty("mail.transport.protocol", "smtps");
            props.put("mail.smtp.user", userid);
            props.put("mail.smtp.password", password);
            props.put("mail.smtp.port", "465");
            props.put("mail.smtps.auth", "true");
            Session session = Session.getDefaultInstance(props, null);
            MimeMessage message = new MimeMessage(session);
            InternetAddress fromAddress = null;
            InternetAddress toAddress = null;

            try {
                fromAddress = new InternetAddress(from);
                toAddress = new InternetAddress(to);
            } catch (AddressException e) {
            }
            message.setFrom(fromAddress);
            message.setRecipient(RecipientType.TO, toAddress);
            message.setSubject(subject);
            message.setText(text);

            //SMTPSSLTransport transport =(SMTPSSLTransport)session.getTransport("smtps");

            Transport transport = session.getTransport("smtps");
            transport.connect(host, userid, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (MessagingException e) {
        }
    }
}