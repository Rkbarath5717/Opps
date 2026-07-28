public class Students{
    private int id;
    private String name;
    private String department;
    private double mark;

    Student(int id,String name,String department,double mark){
        this.id=id;
        this.name=name;
        this.department=department;
        this.mark=mark;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    public void setMark(double mark){
        this.mark=mark;
    }
    public double getMark(){
        return mark;
    }
    @Override
    public String toString(){
        return "Id :" +id+
                "Name :"+name+
                "Department :"+department+
                "Mark :"+mark;
    }
}
import java.util.ArrayList;
public class StudentService{
    private ArrayList<Students> students=new ArrayList<>();

    //Create
    public void addStudent(Students student){
        student.add(student);
        System.out.println("Student is added successfully ! ");
    }

    //Read All
    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("Student is empty ! ");
            return;
        }
        for(Students student : students){
            System.out.println(student);
        }
    }
    //search
    public Students findStudentById(int id){
        for(Students student : students){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }

    //update
    public void updateStudent(int id,String name,String department,double mark){
        Students student = findStudentById(id);
        if(student==null){
            System.out.println("Studnet not found" );
            return;
        }
        student.setName(name);
        student.setDepartment(department);
        student.setMark(mark);
        System.out.println("Student updated successfully ! ");
    }

    //delete

    public void deleteStudent(int id){
        Students student = findStudentById(id);
        if(student==null){
            System.out.println("studnet is not found");
            return;
        }
        students.remove(student);
        System.out.println("Student removed successfully ! ");
    }
}

public class ConsoleApplication {
    public static void main(String[] args) {
        // Your Code goes here!

    }
}