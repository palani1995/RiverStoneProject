package com.riverstone.to;

import java.io.Serializable;
import java.util.Set;

import com.riverstone.model.hibernatemapping.Products;

/**
 * @author Palani
 *
 */

public class CategoriesTO implements Serializable {

	/**
	 * Generated SerialVersionUID
	 */
	private static final long serialVersionUID = 6755846070958957540L;

	
	//Instance variable or member variable
	private String categoryID;
	private String CategoryName;

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Categories [categoryID=" + categoryID + ", CategoryName=" + CategoryName + "]";
	}

}
