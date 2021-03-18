package com.volkanozsay.companymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER_BACKGROUND")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBackground {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userback_id;

    @Column(length = 1000)
    private String userbackground;

    @Column
    @Temporal(TemporalType.DATE)
    private Date userback_createdDate = new Date();

    @Column
    private List<String> userback_skils;
}
