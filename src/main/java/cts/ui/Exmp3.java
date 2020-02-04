package cts.ui;

import javax.persistence.EntityManager;

import cts.model.empl.Manager;
import cts.model.empl.contEmpl;
import cts.model.empl.empl;
import cts.util.JPAUtil;

public class Exmp3 {

	public static void main(String[] args) {
		empl e= new empl(101,"Anirudh",25000);
		Manager m= new Manager(102,"Ayush",30000,9500);
		contEmpl ce=new contEmpl(103,"Pratap",50000,11);
		
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		
		System.out.println("All Records Saved!");
		JPAUtil.shutdown();
		
		
	}
}
