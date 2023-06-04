package com.wpU2sd.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpU2sd.entities.Building;


public interface BuildingRepo extends JpaRepository<Building, Long> {
    List<Building> findByName(String name);

}