package org.core.org.hibernate.Util;

import java.util.Properties;

public class ConnectionProperitiesUtil {
	
	public static Properties getMysqlDbProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hibernate");
		properties.setProperty("hibernate.connection.username","root");
		properties.setProperty("hibernate.connection.password","root");
		properties.setProperty("hibernate.show_sql", "true");//it is used to show the sql query what is the execute
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		
		properties.setProperty("hibernate.hbm2ddl.auto","update");//create table automatic-not used in realtime.
		return properties;
		
	}

}
