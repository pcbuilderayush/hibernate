package cts.model.empl;
import cts.model.empl.empl;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

//@DiscriminatorValue("cemp")
@Table(name="cempjoin")
public class contEmpl extends empl{

	@Column(name="cdur")
	private int ContDur;

	public int getContDur() {
		return ContDur;
	}

	public void setContDur(int contDur) {
		ContDur = contDur;
	}

	public contEmpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public contEmpl(long eid, String ename, double basic,int contDur) {
		super(eid, ename, basic);
		this.ContDur=contDur;
		// TODO Auto-generated constructor stub
	}

	

}
