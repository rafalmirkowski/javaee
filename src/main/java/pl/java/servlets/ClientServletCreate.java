
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


@WebServlet(name = "saveclient", urlPatterns = "/saveclient")
public class ClientServletCreate extends HttpServlet {


    @Inject
    private InterfaceDao implementsDao;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Client client = new Client() ;
        client.setFirstName(req.getParameter("firstName"));
        client.setLastName(req.getParameter("lastName"));
        client.setAddress(req.getParameter("adress"));
        implementsDao.saveClient(client);

        req.setAttribute("saveClient", client );
        req.getRequestDispatcher("Index.jsp").forward(req, resp);
    }


}

