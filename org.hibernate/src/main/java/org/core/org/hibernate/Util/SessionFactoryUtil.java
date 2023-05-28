package org.core.org.hibernate.Util;

import org.core.org.hibernate.Entity.Airhosterss;
import org.core.org.hibernate.Entity.Brand;
import org.core.org.hibernate.Entity.Captain;
import org.core.org.hibernate.Entity.Flight;
import org.core.org.hibernate.Entity.Product;
import org.core.org.hibernate.Entity.Team;
import org.core.org.hibernate.Entity.UserEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionProperitiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(UserEntity.class);
			cfg.addAnnotatedClass(Team.class);
			cfg.addAnnotatedClass(Captain.class);
			cfg.addAnnotatedClass(Airhosterss.class);
			cfg.addAnnotatedClass(Flight.class);
			cfg.addAnnotatedClass(Product.class);
			cfg.addAnnotatedClass(Brand.class);
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
