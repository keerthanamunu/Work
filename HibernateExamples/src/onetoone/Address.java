package onetoone;

import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	private int addressId;
	private String city;
	private String state;
	
	/*@OneToOne
	private Employee emp;*/

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/*public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}*/
}
