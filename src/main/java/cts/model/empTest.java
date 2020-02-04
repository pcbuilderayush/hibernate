package cts.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class empTest {
public static void main(String[] args) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("cts");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	emp e=new emp();
	e.setEmpname("Ayush");
	em.persist(e);
	em.getTransaction().commit();
	em.close();
	emf.close();
	System.out.println("Inserted...");
			
}
}
