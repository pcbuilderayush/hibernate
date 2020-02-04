package cts.model.onetomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Course {
	@Id
	private int cid;
	private String cName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="course")
	private Set<Trainee> trainees;
	
	public Course() {
		
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}

	public Course(int cid, String cName, Set<Trainee> trainees) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.trainees = trainees;
	}
	
}
