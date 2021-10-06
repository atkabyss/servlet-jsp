package chapter4;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class ReDirect
*/
@WebServlet("/ReDirect")
public class ReDirect extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request,
HttpServletResponse response) throws ServletException,
IOException {
int selectno;
String url = "";
selectno = Integer.parseInt(request.getParameter("url"));
switch (selectno) {
case 1:
url = "https://www.neec.ac.jp/";
break;
case 2:
url = "https://www.nkhs.ac.jp/";
break;
case 3:
url = "https://www.katayanagi.ac.jp/";
break;
case 4:
url = "https://www.teu.ac.jp/";
break;
}
response.sendRedirect(url); }
}