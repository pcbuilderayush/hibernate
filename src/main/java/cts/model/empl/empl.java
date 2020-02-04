package cts.model.empl;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="employejoin")
//@DiscriminatorColumn(name="emp_type")
//@DiscriminatorValue("emp")
public class empl {
	@Id
	@Column(name="eid")
	private long eid;
	
	@Column(name="ename")
	private String ename;
	@Column(name="Salary")
	private double basic;

public empl() {
	
}

public empl(long eid, String ename, double basic) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.basic = basic;
}
public long getEid() {
	return eid;
}
public void setEid(long eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getBasic() {
	return basic;
}
public void setBasic(double basic) {
	this.basic = basic;
}
}
