package pl.sda.studentModel;

public class Student {
    private String name;
    private String lastName;
    private int index;

    public Student(String name, String lastName, int index) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
    }

    public Student(){}

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", index=" + index +
                '}';
    }
}
