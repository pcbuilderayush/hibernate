package cts.ui;

import javax.persistence.EntityManager;

import cts.model.comp.Address;
import cts.model.comp.Faculty;
import cts.util.JPAUtil;

public class CompositionDemo {

	public static void main(String[] args) {
		Faculty f= new Faculty(0,"Ayush", new Address("A201","GTB nagar","Delhi"));
		
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		System.out.println("Faculty Saved!");
		JPAUtil.shutdown();
	}
}
