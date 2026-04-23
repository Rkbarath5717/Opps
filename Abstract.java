public class Abstract{
    public static void main(String[] args) {
        vehicle v1 = new car();
        v1.fuel();
        v1.start();
        v1.start();

        vehicle v2 = new bike();
        v2.start();
        v2.stop();
    }
}
abstract class vehicle{
    abstract void start();
    abstract void stop();
    void fuel(){
        System.out.println("Run with fuel");
    }
}
class car extends vehicle{
    void start(){
        System.out.println("Run with fuels");
    }
    void stop(){
        System.out.println("Stop with key");
    }
}

class bike extends vehicle{
    void start(){
        System.out.println("Start with normal  petrol");
    }
    void stop(){
        System.out.println("Stop with bike key");
    }
}
