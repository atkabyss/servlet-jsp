<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>グラデーションJSPその2</title>
</head>
<body>
<% int add = 42; %>
<% int i = 0; %>
<h1>グラデーションJSPその2</h1>
グラデーションの幅:<%= add %><p>

<table border="1">
<tr>
<%
for(int color = 0; color <= 255; color += add){
	String colorHex = String.format("%02x", color);
	//colorを16進数(2桁)に変換
	String colorHTML = colorHex + colorHex + colorHex;
	//HTMLの色指定形式の作成
	out.println(" <td style=\"height: 30px;width: 30px; " + "background-color: #" + colorHTML + ";\"><br></td>");
	i += 1;
	if(i==16)continue;
	if(i%4==0){
		out.println("<tr>");
		out.println("</tr>");
		color -= 126;
	}
}
%>
</tr>
</table>
</body>
</html>