import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> studentsInCourse = new ArrayList<Student>();
    private Teacher teacher;

    public Course(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student;
        Course math = new Course("Math");
        Course english = new Course("English");
        Teacher yosi = new Teacher(1, "Yosi");
        //----assign to course------
        for (int i = 0; i < 10; i++) {
            student = new Student(i, "Omer " + i);
            if (i % 2 == 0) {
                english.joinTheCourse(student);
            }
            math.joinTheCourse(student);

        }
        math.addATeacher(yosi);
        english.addATeacher(yosi);
        math.courseInfo();
        english.courseInfo();


    }

    public void joinTheCourse(Student student) {
        if (studentsInCourse.contains(student)) {
//            System.out.println(student.getName() + " is already in the course.");
        } else {
            studentsInCourse.add(student);
            student.addMyCourse(this);
//            System.out.println(student.getName() + " join the course.");
        }
    }

    public void leaveTheCourse(Student student) {
        if (studentsInCourse.contains(student)) {
            studentsInCourse.remove(student);
            student.removeMeFromCourse(this);
            System.out.println(student.getName() + " left the course.");
        } else {
            System.out.println("Student not found in the course.");
        }
    }

    public void changeNameCourseTeach(String nameCourse, String nameCourseChange) {
//        if (teacher.nameCourseTeach.contains(nameCourse)) {
//            nameCourse = nameCourseChange;
//        }
    }

    public void courseInfo() {
        System.out.println("course's name: " + this.name);
        System.out.println("Teacher's name: " + teacher.getName());
        System.out.println("The names of the students are: ");
        for (Student s : studentsInCourse) {
            System.out.println(s.getName());
        }
    }

    public void printEachCourseTeach() {
//        for (String s : teacher.nameCourseTeach) {
//            System.out.println("The name of the courses that the teacher teaching: " + teacher.nameCourseTeach.toString());
//        }
    }

    public void addATeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
