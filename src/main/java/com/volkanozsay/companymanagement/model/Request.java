package com.volkanozsay.companymanagement.model;

import com.volkanozsay.companymanagement.enums.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "REQUEST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long request_id;

    @Column(nullable = false, length = 50)
    private String request_name;

    @Column(nullable = false, length = 300)
    private String request_description;

    @OneToOne
    private Title user_title;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "request_type_id", referencedColumnName = "reqType_id")
    private RequestType request_requestType;

    @Enumerated(EnumType.STRING)
    private RequestStatus request_status;

    @Column
    private Boolean request_isActive = true;

    @Column
    @Temporal(TemporalType.DATE)
    private Date request_createdDate;
}
