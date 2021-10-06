package chapter4;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
* Servlet implementation class SessionGetServlet
*/
@WebServlet("/SessionGetServlet")
public class SessionGetServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request,
HttpServletResponse response) throws ServletException,

IOException {
String memberName = "";
String memberDate = "";
HttpSession session = request.getSession();
memberName = (String) session.getAttribute("MemberName");
memberDate = (String) session.getAttribute("MemberDate");
PrintWriter out = response.getWriter();
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<meta charset=\"UTF-8\">");
out.println("<title>セッション情報の見本2</title>");
out.println("</head>");
out.println("<body>");
out.println("<hr><h2>その2 セッションの値の取得</h2>");
out.println("ようこそ、" + memberName + "さん<br>");
out.println("その1から取得した内容<br><hr>");
out.println("会員名:" + memberName + "<br>");
out.println("会員入会日:" + memberDate + "<br><br>");
out.println("現在のセッションID : 「" + session.getId() + "」");
out.println("<br>");
out.println("<br>");
out.println("<form action=\"SessionGetServlet\" "
+ "method=\"post\">");
out.println("<input type=\"submit\" "
+ "value=\"もう一度サーブレット「その2」取得を呼び出し\">");
out.println("</form>");
out.println("<br>");
out.println("<form action=\"SessionRemoveServlet\" "
+ "method=\"post\">");
out.println("<input type=\"submit\" "
+ "value=\"サーブレット「その3」値の削除を呼び出し\">");
out.println("</form>");

out.println("<br>");
out.println("<a href=\"startsessionsample.html\">"
+ "入力へ戻す</a>");
out.println("</body>");
out.println("</html>");
}
}