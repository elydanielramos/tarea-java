package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet3")
public class MyServlet3 extends HttpServlet {

	//Tarea del servlet con archivo .jsp
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

//		RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
//		dispatcher.forward(request, response);

	request.getRequestDispatcher("PAGINA-JSP/form.jsp").forward(request, response);

	}

}