
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TodayServlet")
public class TodayServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("euc-kr");
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		PrintWriter out = response.getWriter();
		out.write("<HTML><HEAD><TITLE>현재시간</TITLE></HEAD>");
		out.write("<BODY><H1>");
		out.write("<a href=index.html>메인페이지</a>");
		out.write("<br>");
		out.write("현재시각은:");
		out.write(Integer.toString(year));
		out.write("년");
		out.write(Integer.toString(month));
		out.write("월");
		out.write(Integer.toString(day));
		out.write("일");
		out.write(Integer.toString(hour));
		out.write("시");
		out.write(Integer.toString(minute));
		out.write("분");
		out.write(Integer.toString(second));
		out.write("초");
		out.write("</H1></BODY></HTML");
		out.close();

	}

}
