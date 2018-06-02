package ua.spalah.pipls;

import ua.spalah.university.Audience;
import ua.spalah.university.Cathedra;
import ua.spalah.university.Group;

public class Profesor {
    public String name;
    public Cathedra cathedra;
    public Audience audience;
    public Group[] groups;

    public Profesor(String name, Cathedra cathedra, Audience audience,Group[] groups) {
        this.name = name;
        this.cathedra = cathedra;
        this.audience = audience;
        this.groups = groups;
    }

    public Profesor (String profesorName){
        name = profesorName;

    }
}
