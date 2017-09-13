/*
package pl.java.servlets;

import pl.java.daoInterface.InterfaceDao;
import pl.java.model.Order;


import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "getorder", urlPatterns = "/getorder")
public class OrderServletGet extends HttpServlet {

    @Inject
    InterfaceDao implementsDao ;



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String orderId = req.getParameter("orderId") ;
        Long id = Long.valueOf(orderId);
        Order order = implementsDao.getOrder(id) ;

        req.setAttribute("getOrder", order) ;
        req.getRequestDispatcher("index.jsp" ).forward(req, resp);



    }
}
*/
