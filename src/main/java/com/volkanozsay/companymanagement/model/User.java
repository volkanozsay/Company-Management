package com.volkanozsay.companymanagement.model;

import com.volkanozsay.companymanagement.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long user_id;

    @Column(nullable = false, length = 25)
    private String user_userName;

    @Column(nullable = false, length = 25)
    private String user_name;

    @Column(nullable = false, length = 25)
    private String user_lastName;

    @Column(nullable = false)
    private String user_email;

    @Column(nullable = false)
    private String user_password;

    @Column(nullable = true)
    private String user_phoneNumber;

    @Temporal(TemporalType.DATE)
    private Date user_birtday;

    @Column(nullable = false, length = 255)
    private String user_adress;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Note> user_notes;

    @OneToOne
    private UserBackground user_userbackGround;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Request> user_requests;

    @ManyToMany
    @JoinTable(name = "user_role",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<UserRole> user_userRoles;

    @Enumerated(EnumType.STRING)
    private UserStatus user_userStatus;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<UserGoals> user_userGoals;

    @ManyToMany
    @JoinTable(name = "user_groups",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<UserGroups> user_userGroups;
}
