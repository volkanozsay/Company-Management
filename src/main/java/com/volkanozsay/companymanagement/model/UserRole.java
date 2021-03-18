package com.volkanozsay.companymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.RoleStatus;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER_ROLE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long role_id;

    @Column(nullable = false, length = 50)
    private String role_name;

    @Column(nullable = false, length = 255)
    private String role_description;

    @Enumerated(EnumType.STRING)
    private RoleStatus role_roleStatus;

    @Column
    @Temporal(TemporalType.DATE)
    private Date role_createdDate = new Date();

    @ManyToMany
    private List<User> role_users;

}
