<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="http://localhost:9090/MavenWebApp/InsertController">
<h1>Insert a new Movie</h1>

Enter Id: <input type= "number" name="id"> <br><br>
Enter Movie Name: <input type= "text" name="name"> <br><br>
Enter Actor: <input type= "text" name="actor"> <br><br>
Enter Actress: <input type= "text" name="actress"> <br><br>
Enter Director: <input type= "text" name="director"> <br><br>
Enter Collection: <input type= "number" name="collection"> <br><br>
Enter Date of Release: <input type= "text" name="dor"> <br><br>

<input type="submit" value="Insert">




</form>

</body>
</html>