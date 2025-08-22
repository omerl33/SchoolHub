import java.util.ArrayList;

public class Teacher {
    private int id;
    private String name;
    protected ArrayList<String> nameCourseTeach = new ArrayList<String>();


    public Teacher(int id , String name ){
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



}
