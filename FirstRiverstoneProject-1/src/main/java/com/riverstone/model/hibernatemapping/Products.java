/**
 * 
 */
package com.riverstone.model.hibernatemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import jakarta.persistence.ManyToOne;

/**
 * @author Palani
 *
 */

@Entity
@Table(name = "PRODUCTS")
public class Products {

	private String productID;
	private String categoryID;
	private String productName;
	private Integer price;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PRODUCTID")
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	@Column(name = "CATEGORYID")
	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	
	@Column(name = "PRODUCTNAME")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	//many to one Bidirectional Mapping 
	@ManyToOne()
	@JoinColumn(name = "CATEGORYID")
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [productID=" + productID + ", categoryID=" + categoryID + ", productName=" + productName
				+ ", price=" + price + "]";
	}
	
	

}
