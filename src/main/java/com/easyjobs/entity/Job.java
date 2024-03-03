package com.easyjobs.entity;

import jakarta.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
public class Job extends BaseAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private Long id;

    private String title;

    private String description;

    private String applicationURL;

    private String email;

    private String phoneNumber;

    private Date endDate;

    private String location;

    private String keywords;

    private Boolean easyApply;

    private Boolean active;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @ManyToMany
    @JoinTable(
            name = "job_skill",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> skills;
}
