package it.uniroma3.servelt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/processaDati")
public class MostraParametri extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// gestione della RICHIESTA

		// leggo i parametri
		String nome = request.getParameter("nome").toUpperCase();
		String prezzo = request.getParameter("prezzo").toUpperCase();
		String codice = request.getParameter("codice").toUpperCase();

		// leggo (alcune) intestazioni http della richiesta
		String address = (String)request.getRemoteAddr();
		String host = (String)request.getRemoteHost();
		String userAgent = request.getHeader("User-Agent");
		request.getSession().setAttribute("nome",nome);
		request.getSession().setAttribute("prezzo", prezzo);
		request.getSession().setAttribute("codice", codice);
		//this.getServletContext().getRequestDispatcher(response.encodeURL("/mostraDatiInseriti")).forward(request,response);
		this.getServletContext().getRequestDispatcher(response.encodeURL("/confirm.jsp")).forward(request,response);
	}
}
