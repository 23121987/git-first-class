package ua.spalah.university;

import ua.spalah.pipls.Profesor;

public class Cathedra {
    public String name;
    public Group group;
    public Profesor profesor;

    public Cathedra ( String name, Group group, Profesor profesor){
        this.name = name;
        this.group = group;
        this.profesor = profesor;
    }

    public Cathedra (String cathedraName){
        name = cathedraName;

    }
}
