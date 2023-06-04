package com.proj.weekproject.entity;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate date;

    @ManyToOne
    private User user;

    @ManyToOne
    private Workstation workstation;

    // Costruttori, getter e setter

    // Metodi addizionali
}
