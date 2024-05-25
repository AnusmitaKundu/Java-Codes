import java.util.*;

public class Exception_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x[] = { 1, 2, 3, 4, 5 };
        System.out.print("Dividend: enter array index: ");
        int i = sc.nextInt();
        System.out.print("Divisor: enter value: ");
        int j = sc.nextInt();
        try {
            System.out.println(x[i] / j);
        } catch (ArithmeticException ae) {
            System.out.println("Divisor must not be zero." + ae);
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Wrong index of array." + aie);
        } catch (Exception e) {
            System.out.println("Unknown exception." + e);
        } finally {
            System.out.println("I am always here!!!");
        }
    }
}