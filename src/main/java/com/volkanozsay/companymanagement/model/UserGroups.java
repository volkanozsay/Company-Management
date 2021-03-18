package com.volkanozsay.companymanagement.model;

import com.volkanozsay.companymanagement.enums.UserGroupsStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER_GROUPS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserGroups {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long usergroups_id;

    @Column
    private String usergroups_name;

    @Column
    private String usergroups_title;

    @Temporal(TemporalType.DATE)
    private Date usergroups_createdDate = new Date();

    @ManyToMany
    private List<User> usergroups_users;

    @Enumerated(EnumType.STRING)
    private UserGroupsStatus usergroups_status;
}
