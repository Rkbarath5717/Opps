import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // try{
        //     int a = scn.nextInt();
        //     int b = scn.nextInt();
        //     int result = a/b;
        //     System.out.println(result);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Can not divide");
        // }
        // System.out.println("Program continue....");
               int n = scn.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            try{
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBounceException e){
            System.out.println("Can not access this element");
        }
        System.out.println("This program will be continue..");
    }
}