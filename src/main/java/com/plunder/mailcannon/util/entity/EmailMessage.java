package com.plunder.mailcannon.util.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class EmailMessage {
    private @Id
    @GeneratedValue
    Long id;
    private String to;
    private String subject;
    private String body;

}
