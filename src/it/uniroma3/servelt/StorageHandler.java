package it.uniroma3.servelt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Andrea on 22/04/15.
 */
@WebServlet("/store")
public class StorageHandler extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> productList;
        Double prezzo = 0.0;
        if (req.getSession().getAttribute("productList")!= null){
            productList = (List<Product>)req.getSession().getAttribute("productList");
        }
        else {
            productList = new LinkedList<Product>();
        }
        String nome = (String)req.getSession().getAttribute("nome");
        String codice = (String)req.getSession().getAttribute("codice");
        String prezzoString = (String) req.getSession().getAttribute("prezzo");
        prezzo =  new Double(prezzoString);
        if(nome == null || codice==null||prezzoString==null){
            req.getSession().invalidate();
            req.getSession(true);
            req.setAttribute("errorMessageEmpty","E' stata trovata un'incongruenza tra i cookie e la sessione, la sessione è stata resettata");
            this.getServletContext().getRequestDispatcher(resp.encodeURL("/index.jsp")).forward(req,resp);
        }
        Product newProduct = new Product(nome,codice,prezzo);
        productList.add(newProduct);
        req.getSession().setAttribute("productList",productList);
        this.getServletContext().getRequestDispatcher(resp.encodeURL("/displayInformation.jsp")).forward(req,resp);
    }
}
