package cts.ui;

import java.sql.Date;
import javax.persistence.EntityManager;

import cts.model.Student;
import cts.model.StudentIdentity;
import cts.util.JPAUtil;

public class Example2 {
	public static void main(String[] args) {
	Student s=new Student(new StudentIdentity(2,'A',8),"Radhika","Singh",new Date(2000,04,17));
		
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Student Is Saved");
		JPAUtil.shutdown();
	}
}
