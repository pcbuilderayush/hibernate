package cts.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="emp")
public class Employee {
	@Id
	@Column(name="eid")
	private int EmpId;
	
	@Column(name="ename",nullable=false)
	private String empName;
	
	private double basic;
	public Employee() {
		
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public Employee(int empId, String empName, double basic) {
		super();
		EmpId = empId;
		this.empName = empName;
		this.basic = basic;
	}

}
