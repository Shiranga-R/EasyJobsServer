package com.easyjobs.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Setter
@Getter
@Entity
public class User extends BaseAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phoneNumber;

    @JsonIgnore
    private String password;

    private Boolean active;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "role_id",referencedColumnName = "id",nullable = false)
    private UserRole role;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id",referencedColumnName = "id",nullable = true)
    private UserProfile userProfile;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id",referencedColumnName = "id",nullable = true)
    private Address address;

}
