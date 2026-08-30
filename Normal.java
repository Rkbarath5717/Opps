import java.util.*;
public class Normal {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        try{
            int result = n/m;
            System.out.println(result);
        }
        catch(java.lang.Exception e){
            System.out.println("This is not possible");
        }
        System.out.println("This will be continue...");
    }
}