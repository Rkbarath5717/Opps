class Instance{
    int age;
    String name;
    String work;

    Instance(){
        this.age=19;
        this.name="barath";
        this.work="Business";
    }
}

public class InstanceVariable{
    public static void main(String[] args) {
        Instance I = new Instance();
        System.out.println(I.age);
        System.out.println(I.name);
        System.out.println(I.work);
    }
}
