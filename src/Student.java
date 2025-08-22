import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Course> myCourses = new ArrayList<Course>();


    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addMyCourse(Course course) {
        myCourses.add(course);
    }

    public void removeMeFromCourse(Course course) {
        myCourses.remove(course);
    }

    public int countMyCourses() {
        return myCourses.size();
    }
}
