package org.project;

import com.sun.mail.util.logging.MailHandler;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Starting to Send Mail..... ");

         MailHandlerBase mailHandler = new MailHandlerBase();
         mailHandler.sendMail();



    }
}