package Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int courseId;
    private String CourseTitle;
    private String courseDesc;
    private double coursePrice;
    private byte[] image;
    @OneToOne
    private Admin instructor;
    @OneToMany
    private Set<User> boughtBy;

    public Course() {
    }
    public Course(int courseId, String courseTitle, String courseDesc, double coursePrice, byte[] image, Admin instructor, Set<User> boughtBy) {
        this.courseId = courseId;
        CourseTitle = courseTitle;
        this.courseDesc = courseDesc;
        this.coursePrice = coursePrice;
        this.image = image;
        this.instructor = instructor;
        this.boughtBy = boughtBy;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        CourseTitle = courseTitle;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Admin getInstructor() {
        return instructor;
    }

    public void setInstructor(Admin instructor) {
        this.instructor = instructor;
    }

    public Set<User> getBoughtBy() {
        return boughtBy;
    }

    public void setBoughtBy(Set<User> boughtBy) {
        this.boughtBy = boughtBy;
    }
}
