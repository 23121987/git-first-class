package ua.spalah.university;

import ua.spalah.pipls.Profesor;
import ua.spalah.pipls.Student;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Faculty faculty= new Faculty( "pravo");
        System.out.println(faculty.name);

        Faculty faculty1= new Faculty("sport");
        System.out.println(faculty1.name);
        Faculty faculty2 = new Faculty("bisnes");
        System.out.println(faculty2.name);
        Faculty faculty3 = new Faculty("historu");
        System.out.println(faculty3.name);

        Cathedra cathedra = new Cathedra("veloSport");
        Cathedra cathedra1 = new Cathedra("adminPravo");
        Cathedra cathedra2 = new Cathedra("bisnesPlan");
        Cathedra cathedra3 = new Cathedra("historuUkraine");

        Group group1 = new Group("P1");
        Group group2 = new Group("B2");
        Group group3 = new Group("S4");
        Group group4 = new Group("H3");

        Audience audience = new Audience("1");
        Audience audience1 = new Audience("2");
        Audience audience2 = new Audience("3");
        Audience audience3 = new Audience("4");

        Profesor profesor = new Profesor ("Petrov");
        Profesor profesor1 = new Profesor("Volkov");
        Profesor profesor2 = new Profesor ("Ivanov");
        Profesor profesor3 = new Profesor ("Sidorov");


        Group[] groups = new Group[4];
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        groups[3] = group4;

        Profesor profesor4 = new Profesor("Petrov", new Cathedra("test"), audience, groups);
        Profesor profesor5 = new Profesor("Volkov",  cathedra,audience2, groups);
        Profesor profesor6 = new Profesor("Ivanov", cathedra,audience1,groups);
        Profesor profesor7 = new Profesor("Sidorov",cathedra, audience3,groups);





        




        }
}
