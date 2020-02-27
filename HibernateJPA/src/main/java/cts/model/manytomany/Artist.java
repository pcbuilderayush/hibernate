package cts.model.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Artists")
public class Artist implements Comparable<Artist> {
	@Id
	private int aId;
	private String nName;
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="MovieArtists",
	joinColumns= { @JoinColumn(name="aid")},
	inverseJoinColumns= { @JoinColumn(name="mid")})
	private Set<Movie> movies;
	public Artist() {
		
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getnName() {
		return nName;
	}
	public void setnName(String nName) {
		this.nName = nName;
	}
	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	public Artist(int aId, String nName, Set<Movie> movies) {
		super();
		this.aId = aId;
		this.nName = nName;
		this.movies = movies;
	}
	public int compareTo(Artist a) {
		return (this.aId<a.aId?-1:(this.aId>a.aId?1:0));
	
}
}