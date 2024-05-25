class Vehicle {
    private int maxSpeed, noWheels;

    Vehicle(int ms, int nowhl) {
        maxSpeed = ms;
        noWheels = nowhl;
    }

    public void display() {
        System.out.println("Maximum speed = " + maxSpeed);
        System.out.println("No. of wheels = " + noWheels);
    }
}

class Car extends Vehicle {
    private String model;

    Car(String m, int ms, int nowhl) {
        super(ms, nowhl); // Calling super class constructor
        model = m;
    }

    public void display() { // Overriden method
        System.out.println("Car\nModel: " + model);
        super.display();
    }
}

class Truck extends Vehicle {
    private int capacity;

    Truck(int cap, int ms, int nowhl) {
        super(ms, nowhl); // Calling super class constructor
        capacity = cap;
    }

    public void display() { // Overriden method
        System.out.println("Truck\nCapacity: " + capacity);
        super.display();
    }

}

public class Prog9Inheritance {
    public static void main(String args[]) {
        Car c1 = new Car("Alto", 220, 4);
        c1.display();
        Truck t1 = new Truck(35, 160, 10);
        t1.display();
    }
}