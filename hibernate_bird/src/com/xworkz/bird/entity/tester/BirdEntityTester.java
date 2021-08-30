package com.xworkz.bird.entity.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.entity.BirdEntity;

public class BirdEntityTester {

	public static void main(String[] args) {
		BirdEntity entity = new BirdEntity(2, "Mourning dove", 15, "light grey", "Zenaida macroura", false, false, "Columbidae",
				false, true);

		BirdDAO dao = new BirdDAOImpl();
		dao.save(entity);

		BirdEntity bird = dao.readById(2);
		System.out.println(bird);
	}

}
