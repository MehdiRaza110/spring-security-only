package com.spring_boot_security.entity;



;import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 60)
    private String name;
}