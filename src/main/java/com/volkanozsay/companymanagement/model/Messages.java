package com.volkanozsay.companymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MESSAGES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long message_id;

    @Column(length = 50)
    private String message_name;

    @Column(length = 255)
    private String message_description;

    @Temporal(TemporalType.DATE)
    private Date message_createdDate = new Date();

    @Column
    private User message_sender;


}
