package it.uniroma3.servelt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Andrea on 17/04/15.
 */
@WebServlet("/controllaDati")
public class ProductController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean isAccettable = true;
        String prezzo = req.getParameter("prezzo");
        String nome  = req.getParameter("nome");
        String codice = req.getParameter("codice");
        if (req.getParameter("nome").isEmpty() || req.getParameter("prezzo").isEmpty()|| req.getParameter("codice").isEmpty()) {
            isAccettable = false;
        }
        for (int i = 0; i<prezzo.length(); i++){
            if (prezzo.charAt(i)< '0' || prezzo.charAt(i)>'9')
                isAccettable = false;
        }
        if(isAccettable) {
            this.getServletContext().getRequestDispatcher(resp.encodeURL("/processaDati")).forward(req, resp);

        } else {
            req.setAttribute("errorMessage","E' stato commesso un'errore nell'inserimento dei dati, si prega di controllare");
            req.setAttribute("namePlaceholder",req.getParameter("nome"));
            req.setAttribute("pricePlaceholder",req.getParameter("prezzo"));
            req.setAttribute("codePlaceholder",req.getParameter("codice"));
            this.getServletContext().getRequestDispatcher(resp.encodeURL("/index.jsp")).forward(req, resp);
        }
    }
}
