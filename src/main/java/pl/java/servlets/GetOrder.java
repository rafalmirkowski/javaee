package pl.java.servlets;

import pl.java.model.Order;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/getorder")
public class GetOrder extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @PersistenceUnit(name = "myPersistenceUnit")
    private EntityManagerFactory emf;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long orderId = Long.parseLong(request.getParameter("orderId"));

        EntityManager em = emf.createEntityManager();
        Order order = em.find(Order.class, orderId);
        order.getProducts().size();
        String orderDesc = order.toString();
        em.close();

        response.getWriter().println(orderDesc);
    }
}
