import java.util.*;
class Students{
    private int id;
    private String name;
    private String department;
    private double mark;

    Students(int id,String name,String department,double mark){
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
class StudentService{
    private ArrayList<Students> students=new ArrayList<>();

    //Create
    public void addStudent(Students student){
        students.add(student);
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
        Scanner scn = new Scanner(System.in);
        StudentService service = new StudentService();
        while(true){
            System.out.println("Student Management System");
            System.out.println("1.Add Student");
            System.out.println("2.View All");
            System.out.println("3.Search Student");
            System.out.println("4.Update Student");
            System.out.println("5.Delete Student");
            System.out.println("6.Exit");
            System.out.println("Enter Your choice: ");
            int choice=scn.nextInt();
            switch(choice){
                case 1:
                    int id=scn.nextInt();
                    scn.nextLine();
                    String name=scn.nextLine();
                    String Department=scn.nextLine();
                    double mark=scn.nextDouble();
                    Students student=new Students(id,name,Department,mark);
                    service.addStudent(student);
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    int searchId=scn.nextInt();
                    Students found = service.findStudentById(searchId);
                    if(found != null){
                        System.out.print(found);
                    }
                    else{
                        System.out.print("Student Not found");
                    }
                    break;
            }
        }
    }
}