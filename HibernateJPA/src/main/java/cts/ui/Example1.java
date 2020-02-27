package cts.ui;

import org.apache.log4j.Logger;

import java.util.Scanner;

import javax.persistence.EntityManager;

import cts.model.Employee;
import cts.util.JPAUtil;
public class Example1 {
	 static final Logger logger = Logger.getLogger(Example1.class);
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("EmpId: ");
		e.setEmpId(scan.nextInt());
		System.out.println("Emp Name: ");
		e.setEmpName(scan.next());
		System.out.println("Basic :");
		e.setBasic(scan.nextDouble());
		
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Emp Is Saved");
		logger.debug("Logging Done");
		JPAUtil.shutdown();
		scan.close();
	}
}
