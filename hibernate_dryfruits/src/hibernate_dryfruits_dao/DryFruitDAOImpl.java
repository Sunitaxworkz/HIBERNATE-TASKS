package hibernate_dryfruits_dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate_dryfruits_dto.DryFruitDTO;

public class DryFruitDAOImpl implements DryFruitDAO {

	@Override
	public int save(DryFruitDTO dto) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		int primaryKey = (int) session.save(dto);
		tran.commit();
		System.out.println(primaryKey);
		session.close();
		factory.close();
		return primaryKey;

	}

	@Override
	public DryFruitDTO readById(int primaryKey) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(DryFruitDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		DryFruitDTO database = session.get(DryFruitDTO.class, primaryKey);
		session.clear();
		factory.close();
		return database;

	}
}
