package com.easyjobs.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Setter
@Getter
@Entity
public class UserProfile extends BaseAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private Long id;

    private String summery;

    private String website;

    private String cvUrl;

    private String coverLetterUrl;

    @ManyToMany
    @JoinTable(
            name = "user_profile_skill",
            joinColumns = @JoinColumn(name = "user_profile_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> skills;
}
