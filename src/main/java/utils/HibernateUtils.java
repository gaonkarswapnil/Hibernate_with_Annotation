package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Restaurant;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		System.out.println("COnfiguring Hibernate Programmatically....");
		Configuration hibernateConfig = new Configuration();
		
		Class<Restaurant> entityClass = Restaurant.class;
		hibernateConfig.addAnnotatedClass(entityClass);
		Properties hibernateProps = new Properties();
		hibernateProps.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		hibernateProps.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdac_nov_23?useSSL=false");
		hibernateProps.put("hibernate.connection.username", "root");
		hibernateProps.put("hibernate.connection.password", "root");
		
		hibernateProps.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		hibernateProps.put("hibernate.show_sql", "true");
		hibernateProps.put("hibernate.hbm2ddl.auto", "update");
		
		hibernateConfig.setProperties(hibernateProps);
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		return hibernateFactory;
	}
}
