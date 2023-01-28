<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.riverstone.to.ProductsTO"%>
<%@page import="com.riverstone.to.CategoriesTO"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<center>
<h1>Hello Welcome User</h1>
</center>
<br>
<p>Following are your details</p>
<%
	ProductsTO product = (ProductsTO) request.getAttribute("pto");
	//CategoriesTO categoriesTO = (CategoriesTO) request.getAtrribute("pto");
%>
<font size="5" color="red">
Your productID is <%=product.getProductID()%><br>
Your CategoryID is <%=product.getCategoryID()%><br>
Your ProductName is <%=product.getProductName()%><br>
Your Price is <%=product.getPrice()%><br>
</font>
</body>
</html>




