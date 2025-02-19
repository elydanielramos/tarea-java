package ejemplos.servlet.curso.finalizado;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Formulario desde Servlet</h1>");
		out.println("<form action=\"/myServlet2\">");
		out.println("<label for=\"fname\">Primer Nombre:</label><br>");
		out.println("<input type=\"text\" id=\"fname\" name=\"nombre\" value=\"Daniel\"><br>");
		out.println("<label for=\"lname\">Apellido:</label><br>");
		out.println("<input type=\"text\" id=\"lname\" lastname=\"apellido\" value=\"Ramos\"><br>");
		out.println("<input type=\"submit\" value=\"Enviar\">");
		out.println("</form>");
		out.println("<p><a href=\"/myServlet2\">Vamos al otro Servlet</a></p>");
		out.println("</body></html>");
	}

}