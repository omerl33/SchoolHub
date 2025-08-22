import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students = new ArrayList<Student>();
    private Teacher teacher;

    public void joinTheCourse(Student student){
        if (students.contains(student)) {
            System.out.println(student.getName() + " is already in the course.");
        } else {
            students.add(student);
            System.out.println(student.getName() + " join the course.");
        }
    }
    public void leaveTheCourse(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println(student.getName() + " left the course.");
        } else {
            System.out.println("Student not found in the course.");
        }
    }
    public void changeNameCourseTeach( String nameCourse , String nameCourseChange){
        if(teacher.nameCourseTeach.contains(nameCourse)){
            nameCourse = nameCourseChange;
        }
    }
    public void courseInfo(){
        System.out.println("The name of the course: " + students.getFirst().getCourseName());
        System.out.println("Teacher's name: " + teacher.getName());
        System.out.println("The names of the students are: ");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
    public void printEachCourseTeach(){
        for (String s : teacher.nameCourseTeach){
            System.out.println("The name of the courses that the teacher teaching: " + teacher.nameCourseTeach.toString());
        }
    }
}
