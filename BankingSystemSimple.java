import java.util.*;

class BankAccount{
    private String HolderName;
    private double balance;
    private String pin;

    BankAccount(String Name,double balance,String pin){
        this.HolderName = Name;
        this.balance=balance;
        this.pin=pin;

        System.out.println("Account is created by" + Name);
    }
     public String getHolderName(){
        return HolderName;
     }

     public double getbalance(String enterPin){
        if(enterPin.equals(this.pin)){
            return balance;
        }
        else{
            System.out.println("Invalid Pin");
            return -1;
        }
     }

     public void setHolderName(String newName){
        if(newName != null && !newName.isEmpty()){
            this.HolderName = newName;
            System.out.println("Name :"+ newName);
        }
        else{
            System.out.println("Invalid name");
        }
     }

     public void Deposit(double amount){
        if(amount > 0){
            balance= balance + amount;
            System.out.println("Deposit amount" + amount);
            System.out.println("Balance amount" + balance);
        }
        else{
            System.out.println("Invalid amount entered");
        }
     }

     public void withdraw(double amount,String enterPin){
        if(!enterPin.equals(this.pin)){
            System.out.println("Valid pin need");
        }
        if(amount > balance){
            System.out.println("Insufficient balace please try again !");
        }
        else if(amount <=0){
            System.out.println("Enter Valid amount");
        }
        else{
            balance = balance - amount;
            System.out.println("withdraw amount" + amount);
            System.out.println("Balance Amount" + balance);
        }
     }
}




public class BankingSystemSimple {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BankAccount BA = new BankAccount("RK",5000,"5717");
        System.out.println("------MENU------");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposite");
        System.out.println("3.Withdraw");
        System.out.println("4.Change Name");
        System.out.println("5.Exit");

    int choice;

    do{
        System.out.println("Enter the choice :");

        choice = scn.nextInt();

        switch (choice){


            case 1:
                System.out.println("Enter Pin : " );
                String pin = scn.next();
                double bal = BA.getbalance(pin);
                if ( bal != -1){
                    System.out.println(bal);
                }
                break;


            case 2:
            System.out.println("Enter the deposite amount :");
            double dep = scn.nextDouble();
            BA.Deposit(dep);
            break;

            case 3:
            System.out.println("Enter the withdraw amount = ");
            double amount = scn.nextDouble();
            System.out.println("Enter the pin");
            String wpin = scn.next();
            BA.withdraw(amount,wpin);
            break;


            case 4:
            System.out.println("Enter new Name : ");
            String Name = scn.next();
            BA.setHolderName(Name);
            break;


            case 5:
            System.out.println("Thank You");
            break;

            default:
            System.out.println("Invalid choice");

           }
        }
        while(choice != 5);
    }
}