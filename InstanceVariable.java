class Instance{
    int age;
    String name;

    Instance(){
        this.age=19;
        this.name="barath";
    }
}

public class InstanceVariable{
    public static void main(String[] args) {
        Instance I = new Instance();
        System.out.println(I.age);
        System.out.println(I.name);
    }
}