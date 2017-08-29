<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Book Manager</h2>
<form action="book" method="POST">
    <input type="text" name="isbn" placeholder="ISBN"/><br/>
    <input type="text" name="title" placeholder="Title"/><br/>
    <input type="text" name="author" placeholder="Author"/><br/>
    <input type="submit" value="Save"/>
</form>
<form action="book" method="GET">
    <input type="number" name="id" placeholder="BookID"/><br/>
    <input type="submit" value="Get"/>
</form>
<br><br>
<%--@elvariable id="book" type="pl.java.model.Book"--%>
<c:if test="${null != book}"> ${book} </c:if>
</body>
</html>
