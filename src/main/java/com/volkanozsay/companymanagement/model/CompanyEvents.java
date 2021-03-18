package com.volkanozsay.companymanagement.model;

import com.volkanozsay.companymanagement.enums.EventStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COMPANY_EVENTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyEvents {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long events_id;

    @Column(nullable = false, length = 100)
    private String events_name;

    @Column(nullable = false, length = 500)
    private String events_description;

    @Column(nullable = true, length = 500)
    private String events_url;

    @Temporal(TemporalType.DATE)
    private Date events_startDate;

    @Temporal(TemporalType.DATE)
    private Date events_endDate;

    @Temporal(TemporalType.DATE)
    private Date events_createdDate = new Date();

    @Enumerated(EnumType.STRING)
    private EventStatus events_eventStatus;


}
