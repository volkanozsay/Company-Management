package com.volkanozsay.companymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TITLE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long title_id;

    @Column(nullable = false, length = 50)
    private String title_name;

    @Column(nullable = false, length = 50)
    private String title_description;

    @Column
    private Boolean title_isActive = true;

    @Temporal(TemporalType.DATE)
    private Date title_createdDate = new Date();
}
