package onetomany;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Category {
	
	@Id
	private int catId;
	private String catName;
	
	@ManyToMany(mappedBy="cList")
	Set<Items> itemList = new HashSet<Items>();

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Set<Items> getItemList() {
		return itemList;
	}

	public void setItemList(Set<Items> itemList) {
		this.itemList = itemList;
	}
}
