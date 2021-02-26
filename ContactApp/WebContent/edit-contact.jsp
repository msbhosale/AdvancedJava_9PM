<%@page import="com.happycoding.bean.Contact"%>
<%@page import="com.happycoding.dao.ContactDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<body>

	<%
	int id = Integer.parseInt(request.getParameter("id"));

	ContactDAO cd = new ContactDAO();

	Contact theContact = cd.getById(id);
	%>
	<table>
		<tr>
			<td>Id</td>
			<td><%=theContact.getId()%></td>
		</tr>
		<tr>
			<td>Name</td>
			<td> <input type="text" name="name" value="<%= theContact.getName() %>"> </td>
		</tr>
		<tr>
			<td>Number</td>
			<td><input type="text" name="name" value="<%= theContact.getNumber() %>"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="name" value="<%= theContact.getEmailId()%>"></td>
		</tr>
	</table>

</body>
</html>