<%@page import="com.happycoding.bean.Contact"%>
<%@ page import="java.util.List"%>
<%@ page import="com.happycoding.dao.ContactDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My App</title>
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
	ContactDAO cd = new ContactDAO();

	List<Contact> conactList = cd.getAll();
	%>

	<div>
		<h1>My Contact App</h1>
		<hr>
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Number</th>
				<th>View</th>
				<th>Edit</th>
			</tr>
			<%
			
			for(Contact c : conactList){
				
				out.write("<tr>");
				out.write("<td> "+ c.getId() +" </td>");
				out.write("<td> "+ c.getName() +" </td>");
				out.write("<td> "+ c.getNumber() +" </td>");
				out.write("<td> <a href='view-contact.jsp?id="+ c.getId() +"'> View </a> </td>");
				out.write("<td> <a href='edit-contact.jsp?id="+ c.getId() +"'> Edit </a> </td>");
				out.write("</tr>");
			}
			
			%>
			
		</table>
	</div>

</body>
</html>








