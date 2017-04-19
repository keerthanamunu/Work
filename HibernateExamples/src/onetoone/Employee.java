package onetoone;

import javax.persistence.*;

@Entity
public class Employee {
	
	@Id
	private int EmpId;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private String empName;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;

}
