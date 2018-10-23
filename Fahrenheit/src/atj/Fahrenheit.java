package atj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fahrenheit
 */
@WebServlet(description = "Przelicznik temperatur", urlPatterns = { "/Fahrenheit" })
public class Fahrenheit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Double value1 = Double.parseDouble(request.getParameter("value1"));
		//PrintWriter out = response.getWriter();
		
		switch(request.getParameter("oper"))
		{
		case "+" :
		response.getWriter().println("Wynik: " + (32.0 + value1 * 9 / 5 ));
		break;
		case "-" :
		response.getWriter().println("Wynik: " + (5.0 / 9.0) * (value1 - 32.0)) ;
		
		//out.println(response);
		
		break;
		
		}
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
			}

}
