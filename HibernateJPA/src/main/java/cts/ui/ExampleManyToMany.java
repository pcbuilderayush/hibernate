package cts.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import cts.model.manytomany.Artist;
import cts.model.manytomany.Movie;
import cts.util.JPAUtil;

public class ExampleManyToMany {
public static void main(String[] args) {
	Artist a1=new Artist(101,"Prabhu Deva",new TreeSet<Movie>());
	Artist a2=new Artist(102,"SRK",new TreeSet<Movie>());
	Artist a3=new Artist(103,"Ranbir",new TreeSet<Movie>());
	
	Movie m1=new Movie(101,"Street Dancer",new TreeSet<Artist>());
	Movie m2=new Movie(102,"Street Dancer 2",new TreeSet<Artist>());
	Movie m3=new Movie(103,"Street Dancer 3",new TreeSet<Artist>());
	
	m1.getArtists().add(a1);
	m1.getArtists().add(a3);

	m2.getArtists().add(a2);
	m2.getArtists().add(a3);
	m3.getArtists().add(a3);

	a1.getMovies().add(m1);
	a2.getMovies().add(m2);
	a3.getMovies().add(m1);
	a3.getMovies().add(m2);
	
	EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
	EntityTransaction txn=em.getTransaction();
	
	txn.begin();
	em.persist(a1);
	em.persist(a2);
	em.persist(a3);
	txn.commit();
	JPAUtil.shutdown();

}
}
