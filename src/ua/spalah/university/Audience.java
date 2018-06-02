package ua.spalah.university;

import ua.spalah.pipls.Student;

public class Audience {
    public String name;
    public Group group;
    public Student student;

    public Audience (String name, Group group, Student student){
        this.name = name;
        this.group = group;
        this.student = student;
    }


    public Audience ( String audienceName){
        name = audienceName;
    }
}
