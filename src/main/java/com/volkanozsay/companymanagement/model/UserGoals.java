package com.volkanozsay.companymanagement.model;

import com.volkanozsay.companymanagement.enums.UserGoalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER_GOALS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserGoals {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long usergoals_id;

    @Column
    private String usergoals_name;

    @Column
    private String usergoals_description;

    @Temporal(TemporalType.DATE)
    private Date usergoals_createdDate = new Date();

    @Enumerated(EnumType.STRING)
    private UserGoalStatus usergoals_status;

    @Temporal(TemporalType.DATE)
    private Date usergoals_startDate;

    @Temporal(TemporalType.DATE)
    private Date usergoals_endDate;



}
