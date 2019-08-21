<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/signup">
		<label for="memberId">ID: 
				<input type="text" name="memberId" id="memberId" />
		</label> 
		<label for="memberPassword">Password: 
				<input type="password" name="memberPassword" id="memberPassword" />
		</label> 
		<label for="memberEmail">Email:
				<input type="text" name="memberEmail" id="memberEmail" />
		</label> 
		<label for="memberNickname">Nickname:
				<input type="text" name="memberNickname" id="memberNickname" />
		</label>
		
		<input type="submit" name="roleName" value="CUSTOMER" onClick="customerRegister();"/>
	</form>
	<script>
		function customerRegister(){
	    var customerInfo = new Object();

	    customerInfo.memberId = document.getElementById("username2").value;
	    customerInfo.memberPassword = document.getElementById("password1").value;
	    customerInfo.memberEmail = document.getElementById("email2").value;
	    customerInfo.memberNickname = document.getElementById("nickname").value;
	    customerInfo.roleName = "CUSTOMER";

	    var jsonCustomer = JSON.stringify(customerInfo, null, 2);
		}
	</script>
</body>
</html>