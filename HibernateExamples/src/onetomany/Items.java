package onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Items {
	
	@Id
	private int itemId;
	private String itemName;
	
	/*@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "c")
	private Category c;*/
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="NewTable",
	joinColumns={@JoinColumn(name="itemId")},
	inverseJoinColumns={@JoinColumn(name="catId")})
	private Set<Category> cList= new HashSet<Category>();
	
	public Set<Category> getcList() {
		return cList;
	}

	public void setcList(Set<Category> cList) {
		this.cList = cList;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/*public Category getC() {
		return c;
	}

	public void setC(Category c) {
		this.c = c;
	}*/

}
