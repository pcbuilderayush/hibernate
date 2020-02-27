package cts.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import cts.model.onetomany.Course;
import cts.model.onetomany.Trainee;
import cts.util.JPAUtil;

public class ExampleOneToMany {

	public static void main(String[] args) {
		
	Course mca=new Course(101,"MCA",new TreeSet<Trainee>());
	Course mba=new Course(102,"MBA",new TreeSet<Trainee>());
	
	mca.getTrainees().add(new Trainee(201,"Ayush", mca));
	mca.getTrainees().add(new Trainee(202,"Pratap", mca));
	mca.getTrainees().add(new Trainee(203,"Singh", mca));
	
	mba.getTrainees().add(new Trainee(204,"Ani", mba));
	mba.getTrainees().add(new Trainee(205,"abhi", mba));
	mba.getTrainees().add(new Trainee(206,"Ajay", mba));
	
	EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
	EntityTransaction txn=em.getTransaction();
	
	txn.begin();
	em.persist(mba);
	em.persist(mca);
	txn.commit();
	System.out.println("Done!");
	}
}