package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Restaurant;
import utils.HibernateUtils;

public class HibernateAnnotationMain {

	private static void insertRestaurant() {
		// TODO Auto-generated method stub
		try(SessionFactory factory = HibernateUtils.getSessionFactory();
			Session session = factory.openSession()) {
			Restaurant rst[] = new Restaurant[5];
			rst[0] = new Restaurant("Hotel Sliversand", "Thai", 7);
			rst[1] = new Restaurant("Sliversand", "desert food", 17);
			rst[2] = new Restaurant("Hotel", "food", 70);
			rst[3] = new Restaurant("Hotel Chandru", "Ulhasnagar food", 37);
			rst[4] = new Restaurant("xxxxxx", "Expensive food", 23);
			
			Transaction tr = session.beginTransaction();
			for(Restaurant res: rst) {
				session.save(res);
			}
			
			tr.commit();
			System.out.println("Record Inserted");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private static void selectAllRestaurant() {
		// TODO Auto-generated method stub
		try(SessionFactory factory = HibernateUtils.getSessionFactory();
				Session session = factory.openSession()) {
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertRestaurant();
		selectAllRestaurant();
	}

	
	
}
