
package pl.java.model;

import pl.java.model.Order;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "clients")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long id ;
    @Column(name = "firstname", nullable = false)
    private String firstName ;
    @Column(name = "lastname", nullable = false)
    private String lastName ;
    @Column(name = "address", nullable = false)
    private String address ;
   // @OneToMany(mappedBy = "client")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Order_Id")
    private List<Order> orders ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", orders=" + orders +
                '}';
    }
}

