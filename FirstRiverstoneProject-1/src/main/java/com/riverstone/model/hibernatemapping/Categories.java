package com.riverstone.model.hibernatemapping;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
* @author Palani
*
*/

@Entity
@Table(name = "CATEGORIES")
public class Categories {

	private String categoryID;
	private String CategoryName;
	Set<Products> products;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CATEGORYID")
	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	@Column(name = "CATEGORYNAME")
	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	// one to many mapping
	@OneToMany(mappedBy = "productID", cascade = CascadeType.ALL)
	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

}
