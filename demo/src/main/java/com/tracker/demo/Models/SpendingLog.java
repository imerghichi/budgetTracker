package com.tracker.demo.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SpendingLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column @NotEmpty
    private Date date;

    @Column @NotEmpty
    private String item;

    @Column
    private boolean need;

    @Column @NotEmpty
    private double amount;


}
