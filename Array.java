import java.util.*;
public class Array {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        try{
            System.out.println(arr[0]);
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Can't access this elemets");
        }
        System.out.println("Program will proces...");
    }
}