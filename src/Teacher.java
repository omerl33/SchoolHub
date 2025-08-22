import java.util.ArrayList;

public class Teacher {
    protected ArrayList<Course> teacherCourses = new ArrayList<Course>();
    private int id;
    private String name;


    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        teacherCourses.add(course);
    }

    public void removeCourse(Course course) {
        teacherCourses.remove(course);
    }
}
