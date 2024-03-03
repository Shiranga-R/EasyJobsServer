package com.easyjobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Address extends BaseAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private Long id;

    private String line1;

    private String line2;

    private String line3;

    private String city;

    private String country;

    private String postcode;

}
