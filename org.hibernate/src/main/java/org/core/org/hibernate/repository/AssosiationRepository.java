package org.core.org.hibernate.repository;

import org.core.org.hibernate.Entity.Brand;
import org.core.org.hibernate.Entity.Flight;
import org.core.org.hibernate.Entity.Team;
import org.core.org.hibernate.Util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AssosiationRepository {
	
	public void saveTeamDetails(Team team) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(team);
		transaction.commit();
	}
	
	public void saveFlightDetails(Flight flight) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(flight);
		transaction.commit();
		
	}
	public void saveBrandDetails(Brand brand) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(brand);
		transaction.commit();
	}

}
