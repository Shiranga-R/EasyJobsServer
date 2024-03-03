package com.easyjobs.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Getter
@Setter
@Entity
public class Skill extends BaseAudit{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private Long id;

    @Column(unique = true)
    private String skill;

    @ManyToMany(mappedBy = "skills")
    private Set<UserProfile> userProfiles;

    @ManyToMany(mappedBy = "skills")
    private Set<Job> jobs;
}
