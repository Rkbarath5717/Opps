class Student{
   int id;
   String name;
   String department;
   int age;
   int rank;
   int star;

   Student(int id,String name,String department,int age,int rank,int star){
      this.id=id;
      this.name=name;
      this.department=department;
      this.age=age;
      this.rank=rank;
      this.star=star;
   }
   void show(){
      System.out.println(id);
      System.out.println(name);
      System.out.println(department);
      System.out.println(age);
      System.out.println(rank);
      System.out.println(star);
   }

}
public class java{  
   public static void main(String args[]){  
      Student s= new Student(1,"barath","Ece",20,1);
      s.show();
   }  
}   