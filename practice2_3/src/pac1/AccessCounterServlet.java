package pac1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CounterServlet")
public class AccessCounterServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		Integer count = 0;
		ServletContext application = config.getServletContext();
		application.setAttribute("count", count);
		System.out.println("ini()が実行されました");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		ServletContext application = this.getServletContext();
		Integer count = (Integer)application.getAttribute("count");
		count++;
		application.setAttribute("count", count);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>アクセスカウンタ</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<font size=\"6\">アクセスカウンタ</font>");
		out.println("<p>あなたは、" + count + "人目の訪問者です</p>");
		out.println("</body>");
		out.println("</html>");

	}

	@Override
	public void destroy() {
		System.out.println("destroy()が実行されました");
	}

}