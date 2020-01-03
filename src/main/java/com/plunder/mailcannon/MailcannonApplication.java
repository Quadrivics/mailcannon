package com.plunder.mailcannon;

import com.plunder.mailcannon.util.helpers.EmailService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailcannonApplication {

    public static void main(String[] args) {
        EmailService.send("from", "pwd", "toadress", "test hoi", "test hoi geslaagd");
    }
}
