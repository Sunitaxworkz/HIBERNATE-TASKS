package com.xworkz.bird.entity.dao;

import com.xworkz.bird.entity.BirdEntity;

public interface BirdDAO {
	public int save(BirdEntity entity);

	BirdEntity readById(int primaryKey);
}
