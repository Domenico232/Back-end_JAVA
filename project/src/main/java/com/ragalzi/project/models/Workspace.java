package com.ragalzi.project.models;

import java.util.List;

import com.ragalzi.project.enumerates.WorkspaceType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "workspaces")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private WorkspaceType type;

    @Column(nullable = false)
    private int maxOccupancy;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Building building;

    @OneToMany(mappedBy = "workspace", fetch = FetchType.EAGER)
    private List<Reservation> reservations;
    
    

    public Workspace() {
		super();
	}

	public Workspace(
            String name, String description, WorkspaceType type,
            int maxOccupancy) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.maxOccupancy = maxOccupancy;
    }

	public List <Reservation> getReservations() {
		// TODO Auto-generated method stub
		return reservations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public WorkspaceType getType() {
		return type;
	}

	public void setType(WorkspaceType type) {
		this.type = type;
	}

	public int getMaxOccupancy() {
		return maxOccupancy;
	}

	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	

}