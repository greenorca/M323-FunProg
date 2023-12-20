package ch.wiss;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Student> students = new ArrayList<>();
        StudentFilter filter = new StudentFilter();
        students.add(new Student(1, 17, "7F8", "Peter"));
        students.add(new Student(2, 17, "7F8", "Tony"));
        students.add(new Student(3, 18, "7F8", "Bruce"));
        students.add(new Student(4, 18, "7F8", "Natasha"));
        students.add(new Student(5, 20, "7F8", "StarLord"));
        students.add(new Student(6, 20, "8F9", "Mike"));
        students.add(new Student(7, 16, "8F9", "Pamela"));
        students.add(new Student(8, 15, "8F9", "Jim"));
        students.add(new Student(9, 15, "8F9", "Toby"));
        students.add(new Student(10, 14, "8F9", "Kevin"));

        System.out.println("Printing Students of Class 7F8");
        System.out.println("------------");
        System.out.printf("%s:\t%-10s\t[%s]\n", "ID", "Firstname", "Class");
        System.out.println("------------");

        for (Student s :filter.filterByClassName(students, "7F8")) {
            System.out.printf("%d:\t%-10s\t[%s]\n", s.getId(), s.getFirstName(), s.getClassName());
        }
        System.out.println("------------");

        System.out.println();

        System.out.println("Printing Students of age 17 or older");
        System.out.println("------------");
        System.out.printf("%s:\t%-10s\t[%s]\n", "ID", "Firstname", "Age");
        System.out.println("------------");

        for (Student s :filter.filterByAge(students, 17)) {
            System.out.printf("%d:\t%-10s\t[%d]\n", s.getId(), s.getFirstName(), s.getAge());
        }
        System.out.println("------------");
    }
}
