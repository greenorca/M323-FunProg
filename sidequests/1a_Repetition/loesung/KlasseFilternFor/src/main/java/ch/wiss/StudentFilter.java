package ch.wiss;

import java.util.ArrayList;

public class StudentFilter {
    public ArrayList<Student> filterByAge(ArrayList<Student> students, int age){
        ArrayList<Student> filteredStudents = new ArrayList<>();
        for (Student s : students) {
            if (s.getAge() >= age) {
                filteredStudents.add(s);
            }
        }
        return filteredStudents;
    }

    public ArrayList<Student> filterByClassName(ArrayList<Student> students, String className){
        ArrayList<Student> filteredStudents = new ArrayList<>();
        for (Student s : students) {
            if (s.getClassName().equalsIgnoreCase(className)) {
                filteredStudents.add(s);
            }
        }
        return filteredStudents;
    }

}
