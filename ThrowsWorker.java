public class ThrowsWorker {
    public static void main(String[] args) {
        // int age =16;
        // try{
        //     if(age < 18){
        //         throw new java.lang.Exception("Age is not eligible");
        //     }
        //     System.out.println("Eligible");
        // }
        // catch(java.lang.Exception e){
        //     e.printStackTrace();
        // }

        int works = 21;

        try{
            if(works < 24){
                throw new java.lang.Exception("Must be work in 24 hrs...");
            }
            System.out.println("Go to your home...");
        }
        catch(java.lang.Exception e){
            e.printStackTrace();
        }
    }
}