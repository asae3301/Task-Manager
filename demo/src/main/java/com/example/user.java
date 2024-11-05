/**
 * This is the user class. 
 * @author  Asael Medina Galvan
 * @version Nov 05, 2024
 */
package demo.src.main.java.com.example;

public class user {
    private Long id;
    private String username;
    private String email;
    private String password;
    
    // setters and getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return username;
    }

    public void setUser(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = email;
    }

    public String getPass() {
        return password;
    }

    public void setPass(String password) {
        this.password = password;
    }
}
