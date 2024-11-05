/**
 *this is the task class.
 *
 * @author  Asael Medina
 * @version Nov 05, 2024
 */
package demo.src.main.java.com.example;

import java.sql.Date;

public class task {
    // attributes of a clss
    private Long id;
    private String title;
    private String descripton;
    private Date dueDate;
    private String status;
    
    // setters and getters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesciprtion() {
        return descripton;
    }

    public void setDescription(String description) {
        this.descripton = description;
    }

    public Date getDuDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status; 
    }
}
