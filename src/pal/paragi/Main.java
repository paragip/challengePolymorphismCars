package pal.paragi;

class Cars {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Cars(String name, int cylinders) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine () {
        return "engine is starting -- Cars";
    }

    public String accelerate () {
        System.out.println("accelerating is in progress");
        return "accelerating is in progress";
    }

    public String brake () {
        System.out.println("brake is in use");
        return "brake is in use";
    }
}

class Mazda extends Cars {
    public Mazda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }
}

public class Main {
    public static void main(String[] args) {
        Mazda mazda = new Mazda("mazda 3", 6);
        System.out.println(mazda.startEngine());
        System.out.println(mazda.getName());
        System.out.println(mazda.getCylinders());
    }
}
