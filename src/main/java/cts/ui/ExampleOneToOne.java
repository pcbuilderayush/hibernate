package cts.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import cts.model.onetoone.BankAccount;
import cts.model.onetoone.Customer;
import cts.util.JPAUtil;

public class ExampleOneToOne {

	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("88888888","Ayush",ba);
		
		ba.setAccno("SB22054");
		ba.setCustomer(cs);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn= em.getTransaction();
		
		txn.begin();
		em.persist(cs);
		txn.commit();
		System.out.println("Done!");
		JPAUtil.shutdown();
		
	}
}
