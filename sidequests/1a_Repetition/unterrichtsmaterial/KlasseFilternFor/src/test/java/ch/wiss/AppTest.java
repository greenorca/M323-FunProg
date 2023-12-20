package ch.wiss;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testClassFilter(){
        ArrayList<Student> students = new ArrayList<>();
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

        StudentFilter filter = new StudentFilter();
        ArrayList<Student> classFilteredStudents = filter.filterByClassName(students, "7F8");
        ArrayList<Student> classFilteredStudents2 = filter.filterByClassName(students, "8F9");

        Assert.assertTrue(classFilteredStudents.stream().anyMatch(s -> s.getId() == 1));
        Assert.assertTrue(classFilteredStudents.stream().anyMatch(s -> s.getId() == 2));
        Assert.assertTrue(classFilteredStudents.stream().anyMatch(s -> s.getId() == 3));
        Assert.assertTrue(classFilteredStudents.stream().anyMatch(s -> s.getId() == 4));
        Assert.assertTrue(classFilteredStudents.stream().anyMatch(s -> s.getId() == 5));
        Assert.assertTrue(classFilteredStudents2.stream().anyMatch(s -> s.getId() == 6));
        Assert.assertTrue(classFilteredStudents2.stream().anyMatch(s -> s.getId() == 7));
        Assert.assertTrue(classFilteredStudents2.stream().anyMatch(s -> s.getId() == 8));
        Assert.assertTrue(classFilteredStudents2.stream().anyMatch(s -> s.getId() == 9));
        Assert.assertTrue(classFilteredStudents2.stream().anyMatch(s -> s.getId() == 10));
    }

    @Test
    public void testAgeFilter(){
        ArrayList<Student> students = new ArrayList<>();
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

        StudentFilter filter = new StudentFilter();
        ArrayList<Student> ageFilteredStudents = filter.filterByAge(students, 17);
        ArrayList<Student> ageFilteredStudents2 = filter.filterByAge(students, 14);

        Assert.assertTrue(ageFilteredStudents.stream().anyMatch(s -> s.getId() == 1));
        Assert.assertTrue(ageFilteredStudents.stream().anyMatch(s -> s.getId() == 2));
        Assert.assertTrue(ageFilteredStudents.stream().anyMatch(s -> s.getId() == 3));
        Assert.assertTrue(ageFilteredStudents.stream().anyMatch(s -> s.getId() == 4));
        Assert.assertTrue(ageFilteredStudents.stream().anyMatch(s -> s.getId() == 5));
        Assert.assertTrue(ageFilteredStudents.stream().anyMatch(s -> s.getId() == 6));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 1));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 2));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 3));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 4));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 5));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 6));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 7));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 8));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 9));
        Assert.assertTrue(ageFilteredStudents2.stream().anyMatch(s -> s.getId() == 10));
    }
}
