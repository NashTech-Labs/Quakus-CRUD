package org.knoldus.Application.entity;

import javax.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "students")
public class StudentEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name="first_name")
    public String first_name;

    @Column(name="last_name")
    public String last_name;
}