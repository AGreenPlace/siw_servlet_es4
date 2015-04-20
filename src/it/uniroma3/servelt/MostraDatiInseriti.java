package it.uniroma3.servelt;

/**
 * Created by Andrea on 15/04/15.
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/mostraDatiInseriti")
public class MostraDatiInseriti extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        // preparo un oggetto su cui scrivere la risposta
        PrintWriter out = response.getWriter();
        //this.getServletContext().getRequestDispatcher("/confirm.jsp").forward(request, response);
        // scrivo il corpo
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"ISO-8859-1\" />");
        out.println("<title>mostra parametri</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Dati inseriti nella form</h1>");
        out.println("<ul>");
        out.println("<li>Nome: <b>" + request.getSession().getAttribute("nome") + "</b></li>");
        out.println("<li>Cognome: <b>" + request.getSession().getAttribute("cognome") + "</b></li>");
        out.println("</ul>");
        String encodedUrl = response.encodeURL("/mostraDati");
        out.println("<a href=\"" + encodedUrl +"\">\n" +
                "Conferma\n" +
                "</a>");
        out.println("<a href=\"/index.jsp\">\n" +
                "Annulla\n" +
                "</a>");
        out.println("</body>\n</html> ");


    }
}
