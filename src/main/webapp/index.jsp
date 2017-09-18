<%--
  Created by IntelliJ IDEA.
  User: rafal
  Date: 9/18/17
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product explorer</title>
</head>
<body>

<h1>Product Manger</h1>

<h2>Add Product</h2>
<form action="products?add=true" method="post">
    <input type="text" name="productName" placeholder="Product Name"/>
    <input type="number" name="productPrice" step="0.1" placeholder="Product Price"/>
    <input type="text" name="productCategory" placeholder="Product Category"/>
    <input type="submit" value="Add"/>
</form>

<form action="products?add=false" method="post">
    <input type="text" name="query" placeholder="JPQL Query" style="width: 500px">
    <input type="submit" value="Get">
</form>
</body>
</html>
