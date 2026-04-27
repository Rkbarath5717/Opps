import java.util.*;

class Patient{
    private String patientName;
    private int age;
    private int patientId;
    private double temperature;
    private String condition;
    private double bill;

    Patient(String patientName,int age,int patientId,double temperature){
        this.patientName=patientName;
        this.patientId=patientId;
        setAge(age);
        setTemperature(temperature);
        System.out.println("Patient is admit  :" + patientName);
    }

    public String getPatientName(){
        return patientName;
    }

    public int getAge(){
        return age;
    }

    public int getPatientId(){
        return patientId;
    }

    public double getTemperature(){
        return temperature;
    }

    public String getCondition(){
        return condition;
    }

    public double getBill(){
        return bill;
    }

    public void setPatientName(String name){
        if(name != null && !name.isEmpty()){
            this.patientName = name;
            System.out.println("Name update : " + name);
        }
        else{
            System.out.println("Invalid name");
        }
    }

    public void setAge(int age){
        if(age > 0 && age <=100){
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
    }

    public void setTemperature(double temperature){
        if(temperature >= 95.5 && temperature <= 105.0){
            this.temperature = temperature;
            checkCondition();
            calculateBill();
        }
        else{
            System.out.println("Invalid temperature");
        }
    }

    public void checkCondition(){
        if(temperature <= 98.0){
            condition = "Normal";
        }
        else if( temperature <= 100.4){
            condition = "Mild fewer";
        }
        else{
            condition = "Over fewer";
        }
    }

    public void calculateBill(){
        if(condition.equals("Normal")){
            bill = 500;
        }   
        else if(condition.equals("Mild fewer")){
            bill = 1000;
        }
        else{
            bill = 2000;
        }
    }

    public void showReport(){
        System.out.println("--------Patient report--------");
        System.out.println("Name :" + patientName);
        System.out.println("Patient id :" + patientId);
        System.out.println("Age :" + age);
        System.out.println("Temperature : " + temperature);
        System.out.println("Condition : "+ condition);
        System.out.println("Bill Amount :" + bill);
    }
}


public class HospitalManagement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hospital System");

        System.out.println("Enter Patient Name : ");
        String name = scn.nextLine();

        System.out.println("Enter Patient Id : ");
        int id = scn.nextInt();
        scn.nextLine();

        System.out.println("Enter Patient age: ");
        int  age = scn.nextInt();
        scn.nextLine();


        System.out.println("Enter Temperature: ");
        double  temperature = scn.nextDouble();
        scn.nextLine();


        Patient p = new Patient(name,age,id,temperature);

        int choice;

        do{
            System.out.println("-----Menu-----");
            System.out.println("1.view Report");
            System.out.println("2.Update Name");
            System.out.println("3.Update Temperature");
            System.out.println("4.Update Age");
            System.out.println("5.Exit");
            System.out.println("Enter the choise : ");

            choice = scn.nextInt();


            switch(choice){

                case 1 : 
                    p.showReport();
                    break;


                case 2:
                    System.out.println("New name :");
                    name = scn.nextLine();
                    p.setPatientName(name);
                    break;


                case 3:
                    System.out.println("New temperature : ");
                    temperature = scn.nextDouble();
                    p.setTemperature(temperature);
                    System.out.println("Condition : " + p.getCondition());
                    System.out.println("Bill : " + p.getBill());
                    break;

                case 4:
                    System.out.println("New age");
                    age = scn.nextInt();
                    p.setAge(age);
                    break;

                case 5:
                    System.out.println("Get well soon : " + p.getPatientName());


                default:
                System.out.println("Invalid choice ");
            }
        }
        while(choice !=5 );
    }
}