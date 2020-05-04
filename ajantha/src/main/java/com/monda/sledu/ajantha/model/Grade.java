package com.monda.sledu.ajantha.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Id;

@Table(name = "t_grade", schema = "sledu")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Grade {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="medium")
    private String medium;


}
