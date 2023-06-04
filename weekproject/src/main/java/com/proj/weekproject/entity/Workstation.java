package com.proj.weekproject.entity;

import javax.persistence.*;

import com.proj.weekproject.enumerates.WorkstationType;

@Entity
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String description;
    @Enumerated(EnumType.STRING)
    private WorkstationType type;
    private int maxOccupancy;

    @ManyToOne
    private Building building;

    // Costruttori, getter e setter

    // Metodi addizionali
}
