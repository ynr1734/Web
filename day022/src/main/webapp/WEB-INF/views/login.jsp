<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>LOGIN PAGE</h1>
	<form action="login" method="post">
		<label for="iid">ID</label>
		<input id="iid" type="text" name="id"><br>
		<label for="ipwd">PWD</label>
		<input id="ipwd" type="password" name="pwd"><br>
		<input type="submit" value="login">
	</form>
	
</body>
</html>