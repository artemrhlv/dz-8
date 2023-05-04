import java.util.ArrayList;
import java.util.HashMap;

public class Group {

    private Student starosta;
    private ArrayList<Student> groupStudents = new ArrayList<>();
    private HashMap<String, ArrayList<Student>> studTasks = new HashMap<>();


    public Group (Student starosta) {
        this.starosta = starosta;
    }

    public void addStudent (Student student) {
        groupStudents.add(student);
    }

    public void changeStarosta (Student student) {
        this.starosta = student;
    }

    public void deleteStudent (Student student) {
        groupStudents.remove(student);
    }

    public void renameStudent (Student oldStud, Student newStud) {
        int index = groupStudents.indexOf(oldStud);
            groupStudents.set(index, newStud);
    }

    public void addHomework (String key) {
        studTasks.put(key, groupStudents);
    }

}
