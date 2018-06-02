package ua.spalah.university;

import ua.spalah.pipls.Profesor;

import java.security.PublicKey;

public class Faculty {
    public String name;
    public Cathedra cathedra;
    public Group group;
    public Audience audience;
    public Profesor profesor;

    public Faculty (String name, Cathedra cathedra, Group group,Audience audience,Profesor profesor ) {
        this.name = name;
        this.cathedra = cathedra;
        this.group = group;
        this.audience = audience;
        this.profesor = profesor;
    }

    public Faculty(String facultyName){
        name= facultyName;


    }
}
