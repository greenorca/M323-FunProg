package ch.wiss;

public class Student {
    private int id;
    private int age;
    private String className;
    private String firstName;

    public Student(){

    }

    public Student(int id, int age, String className, String firstName) {
        this.id = id;
        this.age = age;
        this.className = className;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
