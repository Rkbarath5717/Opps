public class MultiplesWork {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("This Arithmetic exception ...");
        }

        try{
            int arr[] = {1,2,3,4};
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This Array exception...");
        }

        try{
            String n = null;
            System.out.println(n.length());
        }

        catch(java.lang.Exception c){
            System.out.println("This is not possible");
        }
        System.out.println("The program will be continue....");
    }
}