package ua.spalah.university;

import ua.spalah.pipls.Profesor;
import ua.spalah.pipls.Student;

public class Group {
    public String name;
    public Audience audience;
    public Student student;
    public Profesor profesor;
    public Group (String name, Audience audience,Student student, Profesor profesor){
        this.name = name;
        this.audience = audience;
        this.profesor = profesor;
        this.student = student;
    }


    public Group (String groupName){
    name = groupName;
    //String[] name = {"P1","B2","H3","S4"};

    }
}
