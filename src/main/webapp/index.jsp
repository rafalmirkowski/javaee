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
<br><br>
<%--@elvariable id="book" type="pl.java.model.Book"--%>
<c:if test="${null != create}"> ${create} </c:if>
<c:if test="${null != get}"> ${get} </c:if>
<c:if test="${null != update}"> ${update} </c:if>
<c:if test="${null != showMessage}"> ${showMessage} </c:if>
</body>
</html>
