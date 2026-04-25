import java.util.*;

class Student{
    private String name;
    private int age;
    private int marks;

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if(age > 0){
            this.age=age;
        }
        else{
            System.out.println("Invalid age");
        }
    }

    public void setMarks(int marks){
        if(marks >=0 && marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("Invalid mark");
        }
    }

    public String getName(){
        return name;
    } 

    public int getAge(){
        return age;
    }

    public int getMark(){
        return marks;
    }

    public String getGrade(){
        if(marks >= 90) return "A";
        else if(marks >=80) return "B";
        else if(marks >=70) return "c";
        else if(marks >=60) return "D";
        else if(marks <30) return "Fail";
        else return "Pass";
    }

    void display(){
        System.out.println("Name  = " + name);
        System.out.println("Age  = " + age);
        System.out.println("Marks  = " + marks);
        System.out.println("Grade  = " +  getGrade());
    }
}



public class StudentMark {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        Student s = new Student();
        String name = scn.nextLine();
        s.setName(name);

        int age = scn.nextInt();
        s.setAge(age);

        int marks = scn.nextInt();
        s.setMarks(marks);

        s.display();
    }
}