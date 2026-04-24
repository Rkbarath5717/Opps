public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Barath",20,"ECE",8.46,3,"puliangudi");
        Student s2 = new Student("Sabari",20,"CSE",9.0,3,"Tenkasi");
        Student s3 = new Student("Vicky",19,"IT",8.9,3,"Erode");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.dept);
        System.out.println(s1.cgpa);
        System.out.println(s1.year);
        System.out.println(s1.address);
        System.out.println();
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.dept);
        System.out.println(s2.cgpa);
        System.out.println(s2.year);
        System.out.println(s2.address);
        System.out.println();
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.dept);
        System.out.println(s3.cgpa);
        System.out.println(s3.year);
        System.out.println(s3.address);
        System.out.println();

        s1.Work();
        System.out.println();
        s2.Work();

    }
}

class Student{
    String name;
    int age;
    String dept;
    double cgpa;
    int year;
    String address;

    Student(String name,int age,String dept,double cgpa,int year,String address){
        this.name=name;
        this.age=age;
        this.dept=dept;
        this.cgpa=cgpa;
        this.year=year;
        this.address=address;
    }
    
    void Work(){
        System.out.print(this.name+" is work");
    }
}