package pl.java.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
@NamedQueries({
@NamedQuery(name = "Product.findAll", query = "SELECT c FROM Product c"),
@NamedQuery(name = "Product.findAllOrderByPrice", query = "SELECT c FROM Product c ORDER BY c.price")})
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long id;
    private String name ;
    private Double price ;
    private String category ;

    public Product() {
    }

    public Product(String name, Double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
