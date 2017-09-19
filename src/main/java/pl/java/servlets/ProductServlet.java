package pl.java.servlets;



import pl.java.model.Product;

import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {

    @PersistenceUnit(name = "myPersistenceUnit")
    private EntityManagerFactory emf ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String addProduct = req.getParameter("add") ;
        Boolean add = Boolean.valueOf(addProduct) ;
        if(add){
            addProduct(req);
            resp.sendRedirect(req.getContextPath());
        }else {
            getProducts(req);
            req.getRequestDispatcher("result.jsp").forward(req, resp);
        }
    }

    private void addProduct(HttpServletRequest request){
        String productName = request.getParameter("productName");
        double productPrice = Double.parseDouble(request.getParameter("productPrice")) ;
        String productCategory = request.getParameter("productCategory");
        Product product = new Product(productName, productPrice, productCategory) ;
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(product);
        tx.commit();
        em.close();
    }

    private void getProducts(HttpServletRequest request) {
        String useQuery = request.getParameter("query");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Product> query = em.createQuery(useQuery, Product.class) ;
        List<Product> resultList = query.getResultList() ;
        em.close();
        request.setAttribute("query", useQuery);
        request.setAttribute("products", resultList);
    }
}
