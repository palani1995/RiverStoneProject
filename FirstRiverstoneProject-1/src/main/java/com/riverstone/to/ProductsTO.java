/**
 * 
 */
package com.riverstone.to;

import java.io.Serializable;

/**
 * @author Palani
 *
 */

public class ProductsTO implements Serializable{

	/**
	 * Generated serialVersion
	 */
	private static final long serialVersionUID = -2537601370118239594L;
	
	//instance variable or member variable
	private String productID;
	private String categoryID;
	private String productName;
	private Integer price;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

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
