import java.util.ArrayList;

public class School {
    private ArrayList<Course> courses = new ArrayList<Course>();
    private String name;
    private int  id = 0;

    public static void main(String[] args) {
//        Student student;
//        Course math = new Course("Math");
//        Course english = new Course("English");
//        Teacher yosi = new Teacher(1, "Yosi");
//        //----assign to course------
//        for (int i = 0; i < 10; i++) {l//                english.joinTheCourse(student);
//            }
//            math.joinTheCourse(student);
//
//        }
//        math.setTeacher(yosi);
//        english.setTeacher(yosi);
//        math.courseInfo();
//        english.courseInfo();
//        yosi.printMyCourses();
//
//        yosi.setName("Yoseffa");
//
//        math.courseInfo();


        Course math = new Course("Math");
        Course english = new Course("English");
        School school;
        for (int i = 0; i < 10; i++) {
            Student student;
            if (i % 2 == 0) {
                english.joinTheCourse(student);
            }
            math.joinTheCourse(student);

        }
    }

    public  Person newPerson(String role , String name){
        if (role.equals("student")){
            return new Student(id++ , name);
        }
        else {
            return new Teacher(id++ , name );
        }

    }
}
