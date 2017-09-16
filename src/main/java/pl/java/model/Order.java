
package pl.java.model;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "client_order")
public class Order implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long id ;
    @Column(name = "product", nullable = false)
    private String product ;
    @Column(name = "details" , length = 512)
    private String orderDetails ;
    @ManyToOne
 //   @JoinColumn(name = "client_id")
    private Client client ;

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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
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
                ", product='" + product + '\'' +
                ", orderDetails='" + orderDetails + '\'' +
                '}';
    }
}

