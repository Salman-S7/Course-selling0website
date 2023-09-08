package Model;

import jakarta.validation.constraints.Email;

import javax.persistence.*;
import java.util.List;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;
    private String adminName;
    @Email(message = "Enter valid email")
    private String adminEmail;
    private long adminContact;
    private String adminPassword;
    @OneToMany
    private List<Course> coursesAdded;

    public Admin() {
    }

    public Admin(int adminId, String adminName, @Email(message = "Enter valid email") String adminEmail, long adminContact, String adminPassword, List<Course> coursesAdded) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminContact = adminContact;
        this.adminPassword = adminPassword;
        this.coursesAdded = coursesAdded;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public long getAdminContact() {
        return adminContact;
    }

    public void setAdminContact(long adminContact) {
        this.adminContact = adminContact;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public List<Course> getCoursesAdded() {
        return coursesAdded;
    }

    public void setCoursesAdded(List<Course> coursesAdded) {
        this.coursesAdded = coursesAdded;
    }
}
