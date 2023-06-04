package com.wpU2sd.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wpU2sd.entities.Building;
import com.wpU2sd.entities.Workspace;
import com.wpU2sd.entities.WorkspaceType;
import com.wpU2sd.services.BuildingService;
import com.wpU2sd.services.WorkspaceService;
@Component
public class WorkspaceRunner implements CommandLineRunner {
	@Autowired WorkspaceService ws;
	@Autowired BuildingService bs;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Building b1 = bs.createBuildingFake();
//		bs.save(b1);
//		
//		
//		Building b2 = bs.getById((long) 0);
//		
//		Workspace workspace = new Workspace();
//		
//		workspace.setBuilding(b2);
//		// Set other properties of the workspace
//		workspace.setName("Workspace 1");
//		workspace.setType(WorkspaceType.PRIVATE);
//		workspace.setMaxOccupancy(5);
//
//		// Save the workspace entity
//		ws.save(workspace);
		
//		Workspace w2 = ws.createWorkspaceFake();
//		ws.save(w2);
//		System.out.println(w2);
//		
//		Workspace w3 = ws.createWorkspaceFake();
//		ws.save(w3);
//		System.out.println(w3);
//
//		Workspace w4 = ws.createWorkspaceFake();
//		ws.save(w4);
//		System.out.println(w4);
//		
//		Workspace w5 = ws.createWorkspaceFake();
//		ws.save(w5);
//		System.out.println(w5);
//
//		Workspace w6 = ws.createWorkspaceFake();
//		ws.save(w6);
//     System.out.println(w6);


	}

}
