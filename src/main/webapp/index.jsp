<%--<html>
<body>
<h2>Book Manager</h2>
    <form action="save" method="POST">
        <input type="text" name="isbn" placeholder="ISBN" /><br />
        <input type="text" name="title" placeholder="TITLE" /><br />
        <input type="text" name="author" placeholder="AUTHOR" /><br />
        <input type="submit" value="Save">

    </form>
<form action="get" method="POST">
    <input type="number" name="id" placeholder="BookID" /><br />
    <input type="submit" value="Get" />
</form>
</body>
</html>--%>

<html>
<body>
<h2>Book Manager</h2>
<h3>SAVE</h3>
<form action="save" method="POST">
    <input type="text" name="isbn" placeholder="ISBN" /><br />
    <input type="text" name="name" placeholder="Name" /><br />
    <input type="text" name="author" placeholder="Author" /><br />
    <input type="submit" value="Save" />
</form>
<h3>GET</h3>
<form action="get" method="POST">
    <input type="number" name="id" placeholder="BookID" /><br />
    <input type="submit" value="Get" />
</form>
<h3>UPDATE</h3>
<form action="update" method="post">
    <input type="number" name="id" placeholder="ID" /><br />
    <input type="text" name="isbn" placeholder="ISBN" /><br />
    <input type="text" name="name" placeholder="Name" /><br />
    <input type="text" name="author" placeholder="Author" /><br />
    <input type="submit" value="Update" />
</form>
<h3>DELETE</h3>
<form action="delete" method="post">
    <input type="number" name="id" placeholder="ID">
    <input type="submit" value="Delete">
</form>
</body>
</html>