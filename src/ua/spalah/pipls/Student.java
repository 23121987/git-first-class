package ua.spalah.pipls;

import ua.spalah.university.Faculty;
import ua.spalah.university.Group;

public class Student {
    public String name;
    public String surname;
    public Group group;
    public Faculty faculty;

    public Student() {
    }

    public Student(String name, String surname, Group group, Faculty faculty) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.faculty = faculty;
    }

    public static Student create() {
        String[] name = {"Dima", "Sasha", "Pasha", "Yra", "Sergei", "Vova"};
        Student variabl = new Student();
        variabl.name = name[(int) (Math.random() * name.length)];
        return variabl;
    }
}