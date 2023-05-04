public class Main {

    public static void main (String[] args) {
        Student student1 = new Student("First1", "Last1");
        Student student2 = new Student("First2", "Last2");
        Student student3 = new Student("First3", "Last3");
        Student student4 = new Student("First4", "Last4");

        Group group1 = new Group(student1);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);

        group1.changeStarosta(student2);

        group1.deleteStudent(student3);

        group1.renameStudent(student1, new Student("First111", "Last111"));

        group1.addHomework("Abstraction");
        group1.addHomework("Encapsulation");
        group1.addHomework("Enums");

    }


}