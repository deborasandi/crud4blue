package com.crud.fblue.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person implements AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private Date bithDate;

    @Column
    private int age;

    @NotNull
    @Column(nullable = false)
    private String genere;

    @NotNull
    @Column(nullable = false)
    private String address;

    @Override
    public Long getId() {
        return null;
    }
}