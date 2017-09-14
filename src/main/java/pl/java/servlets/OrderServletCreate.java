
package pl.java.servlets;

import pl.java.daoInterface.InterfaceDao;
import pl.java.model.Client;
import pl.java.model.Order;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "saveorder", urlPatterns = "/saveorder")
public class OrderServletCreate extends HttpServlet {

    @Inject
    private InterfaceDao implementsDao;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Order order = new Order() ;
        order.setOrderDetails(req.getParameter("orderDetails"));


        String clientId = req.getParameter("clientId");
        Long id = Long.valueOf(clientId) ;
        Client client = implementsDao.getClient(id);
        order.setClient(client);


/*Zapisuję dane do bazy*/


        implementsDao.saveOrder(order);

        req.setAttribute("saveOrder", order);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}

