package cts.model.comp;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {

		private String dno;
		private String addL1;
		private String addL2;
		
		public Address() {
			
		}
		public Address(String dno, String addL1, String addL2) {
			super();
			this.dno = dno;
			this.addL1 = addL1;
			this.addL2 = addL2;
		}
		public String getDno() {
			return dno;
		}
		public void setDno(String dno) {
			this.dno = dno;
		}
		public String getAddL1() {
			return addL1;
		}
		public void setAddL1(String addL1) {
			this.addL1 = addL1;
		}
		public String getAddL2() {
			return addL2;
		}
		public void setAddL2(String addL2) {
			this.addL2 = addL2;
		} 
		
		
}
