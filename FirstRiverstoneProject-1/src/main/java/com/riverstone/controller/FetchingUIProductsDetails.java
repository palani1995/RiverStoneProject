package com.riverstone.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.riverstone.to.CategoriesTO;
import com.riverstone.to.ProductsTO;
import com.riverstone.utility.DBUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FetchingUIProductsDetails extends HttpServlet {
	/**
	* 
	*/
	private static final long serialVersionUID = 3970383323638984872L;
	Connection con;

	public void init() throws ServletException {
		try {

			// using created utility method to establish DB connection
			con = DBUtil.getOracleConnection();
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PreparedStatement pst = null;
		PreparedStatement pst1 = null;
		ResultSet rs = null;
		String productID = req.getParameter("productID");
		String categoryID = req.getParameter("categoryID");
		String productName = req.getParameter("productName");
		String prices = req.getParameter("price");
		int price = Integer.parseInt(prices);
		
		
		String categoryName = req.getParameter("CategoryName");

		try {
			// ? question mark is an place holder which is used to get the details from the
			// front end
			pst = con
					.prepareStatement("SELECT PRODUCTID,CATEGORYID,PRODUCTNAME,PRICE FROM PRODCUTS WHERE PRODUCTID = ? and CATEGORYID = ?");
			
			pst1 = con
					.prepareStatement("SELECT CATEGORYID,CATEGORYNAME FROM CATEGORIES WHERE CATEGORYID = ? and CATEGORYNAME = ?");
			pst1.setString(1, categoryID);
			pst1.setString(2, categoryName);
			
			pst.setString(1, productID);
			pst.setString(2, categoryID);
			pst.setString(3, productName);
			pst.setInt(4, price);
			rs = pst.executeQuery();
			if (rs.next()) {
				String productId = rs.getString("PRODUCTID");
				String categoryId = rs.getString("CATEGORYID");
				String productname = rs.getString("PRODUCTNAME");
				String pricee = rs.getString("PRICE");
				
				String categoryNamee = rs.getString("CATEGORYID");
				ProductsTO productTO = new ProductsTO();
				productTO.setProductID(productId);
				
				productTO.setCategoryID(categoryId);
				
				productTO.setProductName(productname);
				productTO.setPrice(Integer.parseInt(pricee));
				
				CategoriesTO categoriesTO = new CategoriesTO();
				categoriesTO.setCategoryID(categoryId);
				categoriesTO.setCategoryName(categoryNamee);

				req.setAttribute("pto", productTO);
				RequestDispatcher rd = req.getRequestDispatcher("./jsp/ProductInfo.jsp");
				rd.forward(req, res);
			}
		} catch (SQLException sqle) {
			System.out.println(sqle);
		} finally {
			try {
				if (rs != null) {

					// closing resultset connection if !=Null
					rs.close();
				}
				if (pst != null) {
					// closing prepared statement connection if !=Null
					pst.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void destroy() {
		try {

			// below method call completely closes the connection
			con.close();
		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}
}
