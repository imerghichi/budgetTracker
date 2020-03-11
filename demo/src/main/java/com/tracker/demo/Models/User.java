package com.tracker.demo.Models;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column @NotEmpty
    private String username;

    @Column @NotEmpty
    private String email;

    @Column @NotEmpty
    private String password;

    @OneToMany
    private Set<SpendingLog> spendingLogs;

}
