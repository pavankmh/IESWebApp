<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
$(document).ready(function() {
	$("#email").blur(function() {
		$("#errMsg").text("");
		$.ajax({
			type : "GET",
			url : "uniqueMailCheck?email="+$("#email").val(),
			success : function(data) {
				if(data=="DUPLICATE"){
					$("#errMsg").text("Duplicate Email");
					$("#submitBtn").prop("disabled", true);
				}else{
					$("#submitBtn").prop("disabled", false);
				}
			}
		});
	});

	$(function () {
	    $("#datepicker").datepicker();
	});
		
});

</script>

</head>
<body>

	<div align="center">
		<h3>Account Registration Form</h3>

		<font color='red'>${failMsg}</font> <font color='green'>${succMsg}</font>

		<form:form action="accountRegistration" method="POST"
			modelAttribute="accountDTO">

			<table>
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" /></td>
				</tr>

				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" /></td>
				</tr>


				<tr>
					<td>Email:</td>
					<td><form:input path="email" id="email" /> <font color='red'><span
							id="errMsg"></span></font></td>
				</tr>


				<tr>
					<td>Phone Number:</td>
					<td><form:input path="userMobile" /></td>
				</tr>


				<tr>
					<td>DOB:</td>
					<td><form:input id="datepicker" type="text" path="dateOfBirth" /></td>
				</tr>


				<tr>
					<td>Gender:</td>
					<td><form:radiobutton path="gender" value="M" /> Male <form:radiobutton
							path="gender" value="F" /> Fe-Male</td>
				</tr>


				<tr>
					<td>Select Role:</td>
					<td><form:select path="role" id="role">
							<form:option value="">-Select-</form:option>
							<form:options items="${roles}" />
						</form:select></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="userPzd" /></td>
				</tr>
				<tr>
					<td>SSN:</td>
					<td><form:input path="ssnNo" /></td>
				</tr>




				<tr>
					<td><input type="reset" value="Reset" /></td>
					<td><input type="submit" value="Submit" id="submitBtn" /></td>
				</tr>

			</table>

		</form:form>


	</div>

</body>
</html>

