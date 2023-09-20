package org.project;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailHandlerBase {
         public  void sendMail()
         {
             //properties

             Properties sysPropertiesMap = System.getProperties();

             //System.out.println(sysPropertiesMap);


             //in this map i want to add  4 more key value pairs : mailing


             sysPropertiesMap.put("mail.smtp.host", "smtp.gmail.com"); // using which smpt server
             sysPropertiesMap.put("mail.smtp.port", "465"); //server port
             sysPropertiesMap.put("mail.smtp.ssl.enable","true"); //ssl - secure socket layer
             sysPropertiesMap.put("mail.smtp.auth","true"); //authentication




             //authentication

             Authenticator mailAuthenticator = new CustomizedMailAuthenticator();

             //session

             Session mailSession =Session.getInstance(sysPropertiesMap,mailAuthenticator);



             //build the mail




             //Mime message

             MimeMessage mailMessage = new MimeMessage(mailSession);

             try {
                 mailMessage.setFrom(MailConstants.SENDER);
                 mailMessage.setSubject("Mail received Successfully");
                 mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress("prateek.199303050@muj.manipal.edu"));
                 mailMessage.setText("code successful for sending mail");


                 Transport.send(mailMessage);
             }

             catch (Exception ex){
                 System.out.println("Some error while parsing mail body");
                 System.out.println(ex.getMessage());
             }



         }
}
