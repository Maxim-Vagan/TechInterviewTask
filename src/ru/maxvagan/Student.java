package ru.maxvagan;

public class Student {

    private int age;
    private String name;

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object compObj){
        if (compObj == this){
            return true;
        } else if (!(compObj instanceof Student) || this.hashCode() != compObj.hashCode()){
            return false;
        } else {
            Student stud = (Student) compObj;
            return (age == stud.getAge() && name.equals(stud.getName()));
        }
    }
}
