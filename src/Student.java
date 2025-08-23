import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<Course> myCourses = new ArrayList<Course>();

    public Student(int id, String name) {
        super(id, name, "student");
    }

    @Override
    public void sayRole() {
        System.out.println("I am a student");
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
