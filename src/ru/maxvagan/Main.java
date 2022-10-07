package ru.maxvagan;

public class Main {

    public static void main(String[] args) {
        // Task for technical Test of Ticket 5
        Student stud1 = new Student(20, "Maksim");
        Student stud2 = new Student(36, "Maksim");
        Student student = new Student(20, "Maksim");

        System.out.println("HashCode of stud1 = " + stud1.hashCode());
        System.out.println("HashCode of stud2 = " + stud2.hashCode());
        System.out.println("Is stud1 equals stud2? > " + stud1.equals(stud2));
        System.out.println("Is stud1 equals student? > " + stud1.equals(student));
        System.out.println("Is stud2 equals \"Maksim\"? > " + stud2.equals("Maksim"));
    }
}
