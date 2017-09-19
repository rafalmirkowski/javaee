package pl.java.servlets;




import pl.java.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/static")
public class ProductServletStatic extends HttpServlet {

    @PersistenceUnit(name = "myPersistenceUnit")
    private EntityManagerFactory emf ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EntityManager em = emf.createEntityManager();
        TypedQuery<Product> query = em.createNamedQuery("Product.findAllOrderByPrice", Product.class) ;
        List<Product> resultList = query.getResultList() ;
        req.setAttribute("products", resultList);
        req.getRequestDispatcher("result.jsp").forward(req, resp);

    }
}
