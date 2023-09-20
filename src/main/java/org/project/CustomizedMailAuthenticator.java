package org.project;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.net.InetAddress;

import java.net.URL;

public class CustomizedMailAuthenticator extends Authenticator {

    @Override
    public PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(MailConstants.SENDER, "akqabzpkfclksmqr");
    }

    }

