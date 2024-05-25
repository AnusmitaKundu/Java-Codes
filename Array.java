import java.util.*;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < s; i++) {
            for (int j = 0; j < s - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int x = 0; x < s; x++) {
            System.out.printf(a[x] + " ");
        }
    }
}
