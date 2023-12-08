package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_restauant_master")
public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "restaurant_id")
	private int restaurantId;
	
	@Column(name = "restaurant_name", length = 25)
	private String name;
	
	@Column(name = "restaurant_cuisine", length = 25)
	private String cuisine;
	
	@Column(name = "restaurant_branchCount")
	private int branchCount;
	
	public Restaurant() {
		System.out.println("Inside Restaurant");
	}

	public Restaurant(String name, String cuisine, int branchCount) {
		this.restaurantId = restaurantId;
		this.name = name;
		this.cuisine = cuisine;
		this.branchCount = branchCount;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public int getBranchCount() {
		return branchCount;
	}

	public void setBranchCount(int branchCount) {
		this.branchCount = branchCount;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", cuisine=" + cuisine + ", branchCount="
				+ branchCount + "]";
	}
	
	
}
