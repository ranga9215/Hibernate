package org.core.org.hibernate.repository;

import org.core.org.hibernate.Dto.Dto;
import org.core.org.hibernate.Entity.UserEntity;
import org.core.org.hibernate.Util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserRepository {
	public void saveOrUpdate(UserEntity userEntity) {
//		Configuration cfg = new Configuration();
//		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//		cfg.addAnnotatedClass(UserEntity.class);
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		Session session = sessionFactory.openSession();//Live Connection.
//		Transaction transaction = session.beginTransaction();
//		session.save(userEntity);
//		transaction.commit();
		
		/*
		 meta data means it gives a extra piece of information it is not used by the user but internally used this 
		 information at the time of code Execution.
		*/
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();//Live Connection.
		Transaction transaction = session.beginTransaction();
		session.merge(userEntity);
		transaction.commit();
			
	}
	
	public UserEntity findById(long id) {
		/*Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(UserEntity.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		*/
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(UserEntity.class, id);
	}
	
	
	public void update(Dto dto) {
		
		UserEntity userEntity=findById(dto.getAltkey());
		if(userEntity!=null)
		{
			userEntity.setName(dto.getName());
			userEntity.setCity(dto.getCity());
			userEntity.setCountry(dto.getCountry());
			userEntity.setPinCode(dto.getPinCode());
			userEntity.setEmail(dto.getEmail());
			saveOrUpdate(userEntity);
		/*	
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(UserEntity.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();//Live Connection.
			Transaction transaction = session.beginTransaction();
			session.save(userEntity);
			transaction.commit();
		*/
		}
		
		
	}

	/*public void delete(long id) {
		UserEntity userEntity = findById(id);
		if(userEntity!=null) {
			userEntity.setName(userEntity.getName());
			userEntity.setCity(userEntity.getCity());
			userEntity.setContactNumber(userEntity.getContactNumber());
			userEntity.setCountry(userEntity.getCountry());
			userEntity.setEmail(userEntity.getEmail());
			userEntity.setPassword(userEntity.getPassword());
			userEntity.setPinCode(userEntity.getPinCode());
			SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(userEntity);
			transaction.commit();
			}
			
		}
	*/
	
	public void delete(UserEntity userEntity) {
		
		UserEntity entity = findById(userEntity.getAltKey());
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(userEntity);
		transaction.commit();
		
		
	}

}
