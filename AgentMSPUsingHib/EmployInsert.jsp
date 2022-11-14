<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%

%>
<body>
	<table border="10" align="center">
		<form action="EmployInsert.jsp" method="get">
			Employ Number: <input type="number" name="empNumber"><br>
			<br> Employ First Name : <input type="text" name="empFirstName"><br>
			<br> Employ Last Name : <input type="text" name="empLastName"><br>
			<br> Employ Address : <input type="text" name="empAddress"><br>
			<br> Employ City : <input type="text" name="empCity"><br>
			Employ Pincode : <input type="text" name="empPincode"><br>

			<input type="submit" value="Insert">
		</form>

	</table>

	<%
	if (request.getParameter("empNumber") != null && request.getParameter("premium") != null) {
		Employ agent = new Employ();
		employ.setEmpNumber(Integer.parseInt(request.getParameter("empNumber")));
		employ.setEmpFirstname(request.getParameter("FirstName"));
		employ.setEmpLastName(request.getParameter("LastName"));
		employ.setEmpAddress(Gender.valueOf(request.getParameter("Address")));
		employ.setEmpCity(Integer.parseInt(request.getParameter("City")));
		employ.setEmpPincode(Double.parseDouble(request.getParameter("Pincode")));

		EmployDAO dao = new EmployDAO();
		out.println(dao.addEmploy(employ));

	}
	%>
</body>
</html>