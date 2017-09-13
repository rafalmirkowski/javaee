/*
package pl.java.servlets;

import pl.java.daoInterface.InterfaceDao;
import pl.java.model.Client;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "getclient" , urlPatterns = "/getclient")
public class ClientServletGet extends HttpServlet {

    @Inject
    InterfaceDao implementsDao ;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String clientId = req.getParameter("clientId") ;
        Long id = Long.valueOf(clientId) ;

        Client client = implementsDao.getClient(id) ;

        req.setAttribute("getClient", client) ;
        req.getRequestDispatcher("index.jsp" ).forward(req, resp);
    }
}
*/
