class A {
    private int x, y;

    A(int x, int y) {
        System.out.println("param");
        this.x = x;
        this.y = y;
    }
}

public class constructorJava {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(1, 2);
    }

}