class StaticDemo {
    static {
        System.out.println("This is executed when the class is loaded.");
    }
    static int x = 50;

    static void show() {
        System.out.println("Showing x:" + x);
    }
}

public class Prog13Static {
    public static void main(String args[]) {
        StaticDemo ob = new StaticDemo();
        System.out.println("Static x:" + StaticDemo.x);
        StaticDemo.show();
    }
}