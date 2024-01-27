import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student>students=new ArrayList<>();
        students.add(new Student("Imon",12,24));
        students.add(new Student("Emran",14,21));
        Collections.sort(students,new SortStudentsByAge());
        for(Student s:students){
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getReg());
        }
    }
}