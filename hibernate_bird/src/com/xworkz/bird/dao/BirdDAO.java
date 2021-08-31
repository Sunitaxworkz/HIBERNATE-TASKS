package com.xworkz.bird.dao;

import com.xworkz.bird.entity.BirdEntity;

public interface BirdDAO {
	public int save(BirdEntity entity);

	BirdEntity readById(int primaryKey);

	void updtaeNameById(int id, String name);

	void deleteById(int id);
}
