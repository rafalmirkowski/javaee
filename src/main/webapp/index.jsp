<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Book Manager</h2>
<form action="create" method="POST">
    <input type="text" name="isbn" placeholder="ISBN"/><br/>
    <input type="text" name="title" placeholder="Title"/><br/>
    <input type="text" name="author" placeholder="Author"/><br/>
    <input type="submit" value="Save"/>
</form>
<form action="get" method="GET">
    <input type="number" name="id" placeholder="BookID"/><br/>
    <input type="submit" value="Get"/>
</form>
<h2>Update</h2>
<form action="update" method="POST">
    <input type="number" name="id" placeholder="ID" /><br />
    <input type="text" name="isbn" placeholder="ISBN" /><br />
    <input type="text" name="name" placeholder="Name" /><br />
    <input type="text" name="author" placeholder="Author" /><br />
    <input type="submit" value="Update" />
</form>
<h2>Delete</h2>
<form action="delete" method="POST">
    <input type="number" name="id" placeholder="ID" /><br />
    <input type="submit" value="Delete" />
</form>
<h2>User Manager</h2>
<h3>Save user</h3>
<form action="create" method="post">
    <input type = "text" name="username" placeholder="Username" /><br />
    <input type = "text" name="email" placeholder="Email" /><br />
    <input type = "password" name="password" placeholder="Password" /><br />
    <input type = "text" name="firstname" placeholder="First name (optional)" /><br />
    <input type = "text" name="lastname" placeholder="Last name (optional)" /><br />
    <input type = "text" name="address" placeholder="Address (optional)" /><br />
    <input type="submit" value="Save" />
</form>

<h3>Get user</h3>
<form action="read" method="post">
    <input type = "text" name="id" placeholder="User Id" /><br />
    <input type="submit" value="Get" />
</form>
<h2>Order manager</h2>

<h3>Add client</h3>
<form action="addclient" method="post" id="addform">
    <input type="text" name="firstName" placeholder="Client first name" />
    <br />
    <input type="text" name="lastName" placeholder="Client last name" />
    <br />
    <input type="text" name="address" placeholder="Address" />
    <br />
    <input type="submit" value="Add Client" />
</form>

<h3>Add order</h3>
<form action="addorder" method="post">
    <input type="number" name="clientId" placeholder="Client ID" />
    <br />
    <input type="text" name="productName" placeholder="Product name" />
    <br />
    <input type="text" name="orderDetails" placeholder="Details" />
    <br />
    <input type="submit" value="Add Order" />
</form>

<h3>Get client</h3>
<form action="getclient" method="post" id="addform">
    <input type="number" name="clientId" placeholder="Client ID" />
    <input type="submit" value="Get Client" />
</form>

<h3>Get order</h3>
<form action="getorder" method="post" id="addform">
    <input type="number" name="orderId" placeholder="Order ID" />
    <input type="submit" value="Get Order" />
</form>
<br><br>
<%--@elvariable id="book" type="pl.java.model.Book"--%>
<c:if test="${null != create}"> ${create} </c:if>
<c:if test="${null != get}"> ${get} </c:if>
<c:if test="${null != update}"> ${update} </c:if>
<c:if test="${null != showMessage}"> ${showMessage} </c:if>
</body>
</html>
