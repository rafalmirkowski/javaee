
package pl.java.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "client_order")
public class Order implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrder")
    private Long id ;
    @ManyToMany
    @JoinTable(name = "order_products",
            joinColumns = {@JoinColumn(name = "order_id",
            referencedColumnName = "idOrder")},
            inverseJoinColumns = {@JoinColumn(name = "product_id",
            referencedColumnName = "idProduct")}
            )
    @Column(name = "product_list")
    private List<Product> products ;
    @Column(name = "details" , length = 512)
    private String orderDetails ;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client ;

    public List<Product> getProducts() {
        return products;
    }

    public void setProduct(List<Product> products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                ", orderDetails='" + orderDetails + '\'' +
                ", client=" + client +
                '}';
    }
}


