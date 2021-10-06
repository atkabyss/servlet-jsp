<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- JSP のコメントは、HTML ソースには出力されない --%>
<!-- HTML のコメントは、HTML ソースに出力される -->
<%
String str = "コメントの説明を行うページ。";
out.println(str); // Java のコメントは、HTML ソースには出力されない
%>
</body>
</html>