package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.entity.BirdEntity;
import com.xworkz.bird.util.SFUtil;

public class BirdDAOImpl implements BirdDAO {

	@Override
	public int save(BirdEntity entity) {

		SessionFactory factory = SFUtil.getFactory();// factory !=null && is closed
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		int primaryKey = (int) session.save(entity);
		tran.commit();
		System.out.println(primaryKey);
		session.close();

		return primaryKey;
	}

	@Override
	public BirdEntity readById(int primaryKey) {

		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		BirdEntity database = session.get(BirdEntity.class, primaryKey);

		return database;
	}

	@Override
	public void updtaeNameById(int id, String name) {
		SessionFactory fact = SFUtil.getFactory();
		Session ses = fact.openSession();
		Transaction trans = ses.beginTransaction();
		BirdEntity database = ses.get(BirdEntity.class, id);
		database.setName(name);
		ses.update(database);
		trans.commit();
		ses.close();

	}

	@Override
	public void deleteById(int id) {
		SessionFactory fact = SFUtil.getFactory();
		Session ses = fact.openSession();
		Transaction trans = ses.beginTransaction();
		BirdEntity database = ses.get(BirdEntity.class, id);
		ses.delete(database);
		trans.commit();
		ses.close();

	}

}
