import java.util.ArrayList;

public class Teacher extends Person {
    protected ArrayList<Course> teacherCourses = new ArrayList<Course>();

    public Teacher(int id, String name) {
        super(id, name, "teacher");
    }

    @Override
    public void sayRole() {
        System.out.println("I am a teacher");
    }

    public void addCourse(Course course) {
        teacherCourses.add(course);
    }

    public void removeCourse(Course course) {
        teacherCourses.remove(course);
    }

    public void printMyCourses() {
        for (Course course : teacherCourses) {
            System.out.println(course.getName());
        }
    }
}
