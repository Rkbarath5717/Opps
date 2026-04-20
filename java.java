class Student{
   int id;
   String name;
   String department;
   int age;
   int rank;

   Student(int id,String name,String department,int age,int rank){
      this.id=id;
      this.name=name;
      this.department=department;
      this.age=age;
      this.rank=rank;
   }
   void show(){
      System.out.println(id);
      System.out.println(name);
      System.out.println(department);
      System.out.println(age);
      System.out.println(rank);
   }

}
public class java{  
   public static void main(String args[]){  
      Student s= new Student(1,"barath","Ece",20,1);
      s.show();
   }  
}   