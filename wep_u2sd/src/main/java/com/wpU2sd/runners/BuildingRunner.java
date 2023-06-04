package com.wpU2sd.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wpU2sd.entities.Building;
import com.wpU2sd.services.BuildingService;

@Component
public class BuildingRunner implements CommandLineRunner {


		@Autowired BuildingService bs;

		@Override
		public void run(String... args) throws Exception {
			System.out.println("BuildingRunner....");
			
			Building b1 = bs.createBuildingFake();
			bs.save(b1);
			Building b2 = bs.createBuildingFake();
			bs.save(b2);
			System.out.println(b1);
			System.out.println(b2);
			
		}
}
