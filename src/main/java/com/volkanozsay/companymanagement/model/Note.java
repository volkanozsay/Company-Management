package com.volkanozsay.companymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "NOTE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long note_id;

    @Column(nullable = false, length = 50)
    private String note_title;

    @Column(nullable = false, length = 300)
    private String note_description;

    @Column
    @Temporal(TemporalType.DATE)
    private Date note_CreatedDate = new Date();

}
