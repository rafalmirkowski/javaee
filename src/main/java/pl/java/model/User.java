package pl.java.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity

public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password ;
    @Column(nullable = false, unique = true)
    private String email ;
    @OneToOne
    @JoinColumn(name = "id_user_details")
    private DetailsUser detailsUser_;

    public DetailsUser getDetailsUser_() {
        return detailsUser_;
    }

    public void setDetailsUser_(DetailsUser detailsUser_) {
        this.detailsUser_ = detailsUser_;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String   toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
