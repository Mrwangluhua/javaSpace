package Day09;

import java.util.Objects;

public class Students {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age &&
                Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students() {

    }

    public Students(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
