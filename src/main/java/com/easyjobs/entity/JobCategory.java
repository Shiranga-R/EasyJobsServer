package com.easyjobs.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Getter
@Setter
@Entity
public class JobCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id",referencedColumnName = "id",nullable = true)
    private JobCategory parent;

    @OneToMany(mappedBy = "parent")
    private Set<JobCategory> childCategories;

    @Column(unique = true)
    private String category;
}
