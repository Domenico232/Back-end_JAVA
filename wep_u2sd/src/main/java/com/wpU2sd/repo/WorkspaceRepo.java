package com.wpU2sd.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wpU2sd.entities.Building;
import com.wpU2sd.entities.Workspace;
import com.wpU2sd.entities.WorkspaceType;

public interface WorkspaceRepo extends JpaRepository<Workspace, Long> {
    List<Workspace> findByName(String name);

    Workspace findByNameAndBuilding(String name, Building building);

    @Query("SELECT w FROM Workspace w JOIN w.building b WHERE w.type = :type AND b.city = :city")
    List<Workspace> findByTypeAndCity(
                    @Param("type") WorkspaceType type,
                    @Param("city") String city);

}
