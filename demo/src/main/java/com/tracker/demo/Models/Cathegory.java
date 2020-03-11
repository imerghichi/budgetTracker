package com.tracker.demo.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cathegory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cathegory;

    @Column @NotEmpty
    private CathegoryEnum name_cathegory;

}
