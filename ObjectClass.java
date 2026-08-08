// class Car{
//     String brand;
//     int speed;
//     void drive(){
//         System.out.println(brand+" "+speed);
//     }
// }


// class Worker{
//     String name;
//     int age;
//     String department;

//     void display(){
//         System.out.println(name+"   " + "   "+  age + "  working in  "+department);
//     }
// }

// class Student{
//     String name;                                    
//     int age;                                                             
//     String department;
//     double mark;
//     Student(String name,int age,String department,double mark){
//         this.name=name;
//         this.age=age;
//         this.department=department;
//         this.mark=mark;
//     }

//     void display2(){
//         System.out.println(name+" - " + age +" - "+ mark+"  -  " + department);
//     }
// }

// class Account{
    
//     private double balance;

//     public double getBalance(){
//         return balance;
//     }

//     public void setBalance(double amount){
//         if(amount > 0){
//             this.balance+=amount;
//         }
//     }

// }

// class Member{
//     private int id;
//     private String name;

//     public void setId(int id){
//         this.id=id;
//     }
//     public int getId(){
//         return id;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
//     public String getName(){
//         return name;
//     }
// }

// class Kaliraj{
//     void work(){
//         System.out.println("In kerala");
//     }
// }
// class Saraswathi extends Kaliraj{
//     void home(){
//         System.out.println("In home to manage the family");
//     }
// }

// class Payment{
//     void pay(){
//         System.out.println("Payment");
//     }
// }

// class Cash extends Payment{
//     void pay(){
//         System.out.println("Payment using cash");
//     }
// }

// class Gpay extends Payment{
//     void pay(){
//         System.out.println("Payment using Gpay");
//     }
// }

// class Card extends Payment{
//     void pay(){
//         System.out.println("Payment using card");
//     }
// }

// class Notification {
//     void Notify(){
//         System.out.println("From notification");
//     }
// }

// class Message extends Notification{
//     void Notify(){
//         System.out.println("From message");
//     }
// }

// class Email extends Notification{
//     void Notify(){
//         System.out.println("From email");
//     }
// }
// abstract class vehicle{

//     abstract void start();

//      void stop(){
//         System.out.println("Vehicle is stopped");
//     }
// }

// class Car extends vehicle{
//     void start(){
//         System.out.println("Car is start by using engine");
//     }
// }

// class Bike extends vehicle{
//     void start(){
//         System.out.println("Bike is start by using engine");
//     }
// }
abstract class Worker{
    abstract void place();
    abstract void local();
    void name(){
        System.out.println("My name is rk barath");
    }
}
class work extends Worker{
    void place(){
        System.out.println("My palce is puliangudi");
    }
    void local(){
        System.out.println("My local is there in tenkasi");
    }
}






















public class ObjectClass {
    public static void main(String[] args) {
        // vehicle v1 = new Car();
        // v1.start();
        // v1.stop();
        // vehicle v2 = new Bike();
        // v2.start();
        // v2.stop();

        // Car c = new Car();
        // c.brand="tata";
        // c.speed=100;
        // c.drive();

        // Worker w = new Worker();
        // w.name="sumithra";
        // w.age=47;
        // w.department="ECE";
        // w.display();

        // Student s = new Student("barath",21,"ECE",90.00);
        // Student s2 = new Student("sabaribala",21,"ECE",90.00);
        // s.display2();
        // s.name="vignesh";
        // s.display2();

        // Account a = new Account();
        // a.setBalance(100);
        // System.out.println(a.getBalance());
        // a.setBalance(100);

        // Member m = new Member();
        // m.setId(19);
        // System.out.println(m.getId());
        // m.setName("Sriban");
        // System.out.println(m.getName());

        // Notification n ;
        // n=new Message();
        // n.Notify();
        // n=new Email();
        // n.Notify();

        // Saraswathi s = new Saraswathi();
        // s.work();
        // s.home();

        // Calculator c = new Calculator();
        // System.out.println(c.add(10,20));
        // System.out.println(c.add(20,30,10));
        // System.out.println(c.add(90,90));

        // Payment p;
        // p=new Gpay();
        // p.pay();
        // p=new Cash();
        // p.pay();
        // p=new Card();
        // p.pay();

            // class Calculator{
    //     int add(int a, int b){
    //         return a+b;
    //     }
    //     int add(int a, int b, int c){
    //         return a+b-c;
    //     }
    //     double add(double a,int b){
    //         return a+b;
    //     }
    // }

       Worker w;
       w=new work();
       w.place();
       w.name();
       w.local();
    }
}
