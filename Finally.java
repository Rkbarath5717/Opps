public class Finally {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 20;
            int result = a/b;
            System.out.println(result);
        }
        catch(java.lang.Exception c){
            System.out.println("Catch will be executed....");
        }
        finally{
            System.out.println("Finally block will be executed...");
        }

        System.out.println("Both catch and finally will be executed...");
    }
}