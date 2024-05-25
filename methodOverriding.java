class Superclass {
    public void method1() {
        System.out.println("This is the method 1 of superclass.");
    }

    public void method2() {
        System.out.println("This is the method 2 of superclass");
    }
}

class Subclass extends Superclass {
    public void method2() {
        System.out.println("This is the overridden method 2 of subclass");
    }

    public void method3() {
        System.out.println("This is the method 3 of subclass");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        // Method Overriding in Java: It allows us to override a parent's methods and
        // provide our own implementation for it, thus allowing us to customize

        Superclass obj1 = new Superclass();
        obj1.method1();
        obj1.method2();

        Superclass obj2 = new Subclass(); //The literal meaning of this line is that you are creating a new object of type Subclass, but you are referencing it using a Superclass reference. 
        obj2.method2();
        // obj2.method3();

        // Subclass obj3 = new Superclass();
        // obj3.method1();
        // obj3.method2();

        Subclass obj4 = new Subclass();
        obj4.method1();
        obj4.method2();
        obj4.method3();
    }
}
