<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rafal
  Date: 9/18/17
  Time: 7:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <title></title>
</head>
<body>
        <a href="${pageContext.request.contextPath}">HomePage</a>
        <h3>Query: <c:out value="${requestScope.query}"/></h3>

<c:choose>
    <c:when test="${not empty requestScope.products}">
        <table border="1">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Category</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="products" items="${requestScope.products}">
                    <tr>
                        <td>${products.id}</td>
                        <td>${products.name}</td>
                        <td>${products.price}</td>
                        <td>${products.catgory}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:when>
    <c:otherwise>
        <strong> Brak produktow spelniajacych kryteria</strong>
    </c:otherwise>
</c:choose>
</body>
</html>
