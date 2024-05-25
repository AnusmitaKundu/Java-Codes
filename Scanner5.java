import java.util.*;

public class Scanner5 {
    public static void main(String args[]) {
        int x, y, prod;
        System.out.print("Enter 2 numbers space separated: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        prod = x * y;
        System.out.println("The product of " + x + " and " + y + " is " + prod + ".");
    }
}