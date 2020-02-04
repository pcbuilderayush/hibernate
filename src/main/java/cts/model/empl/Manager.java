package cts.model.empl;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("Manager")
@Table(name="managerjoin")
public class Manager extends empl{
	@Column(name="HRA")
	private double hra;

	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Manager(long eid, String ename, double basic,double hra) {
		super(eid, ename, basic);
		this.hra=hra;
		// TODO Auto-generated constructor stub
	}


	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	

}
