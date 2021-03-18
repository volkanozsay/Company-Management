package com.volkanozsay.companymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "REQUEST_TYPE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long reqType_id;

    @Column(nullable = false, length = 50 )
    private String reqType_name;

    @Column(nullable = false, length = 255)
    private String reqType_description;

    @Column
    private Boolean reqType_isActive = true;

    @OneToOne
    private Request reqType_request;

}
