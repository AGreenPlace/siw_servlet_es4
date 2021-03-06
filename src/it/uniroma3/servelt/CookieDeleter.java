package it.uniroma3.servelt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Andrea on 22/04/15.
 */
@WebServlet("/deleteCookie")
public class CookieDeleter extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        Cookie c2 = cookies[0];
        c2.setMaxAge(0);
        resp.addCookie(c2);
        Cookie temp = new Cookie("JSESSIONID",null);
        temp.setPath("/");
        temp.setHttpOnly(true);
        temp.setMaxAge(0);
        resp.addCookie(temp);
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
