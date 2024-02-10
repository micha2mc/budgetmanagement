package com.zakado.zkd.budgetmanagement.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "budget", schema = "budgetdb")
@Builder
public class Budget {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nid")
    private int id;

    @Basic
    @Column(name = "id_movie")
    private int idmov;

    @Column(name = "budget_inicial")
    private double budgetIni;

    @Column(name = "budget_current")
    private double budgetCurrent;

}
