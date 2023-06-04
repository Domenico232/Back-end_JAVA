package com.wpU2sd.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wpU2sd.entities.Building;
import com.wpU2sd.entities.Reservation;
import com.wpU2sd.entities.User;
import com.wpU2sd.entities.Workspace;
import com.wpU2sd.services.BuildingService;
import com.wpU2sd.services.ReservationService;
import com.wpU2sd.services.UserService;
import com.wpU2sd.services.WorkspaceService;
@Component
public class ReservationRunner implements CommandLineRunner {
	@Autowired ReservationService rs;
	@Autowired UserService us;
	@Autowired WorkspaceService ws;
	@Autowired BuildingService bs;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		User u2 = us.createUserFake();
		us.save(u2);
		
		
		Building b1 = bs.createBuildingFake();
		bs.save(b1);
		Building b2 = bs.getById((long)1);
		
		
		
		Workspace w2 = ws.createWorkspaceFake();
		w2.setBuilding(b2);
		ws.save(w2);
		
		User u1 = us.getById(1);
		System.out.println(u1);
		
		Workspace w1 =  ws.getById((long) 1);
		
		Reservation r1 = rs.createReservationFake();
		r1.setUser(u1);
		r1.setWorkspace(w1);
		rs.save(r1);
		System.out.println(r1);
		
//		Reservation r2 = rs.createReservationFake();
//		rs.save(r2);
//		System.out.println(r2);
//		
//		Reservation r3 = rs.createReservationFake();
//		rs.save(r3);
//		System.out.println(r3);
//		
//		Reservation r4 = rs.createReservationFake();
//		rs.save(r4);
//		System.out.println(r4);
//		
//		Reservation r5 = rs.createReservationFake();
//		rs.save(r5);
//		System.out.println(r5);
//		
//		Reservation r6 = rs.createReservationFake();
//		rs.save(r6);
//		System.out.println(r6);
		
		
		
	}

}
