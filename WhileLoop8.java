import java.util.*;

public class WhileLoop8 {
    public static void main(String args[]) {
        int i = 0;
        while (true) {
            ++i;
            if (i % 2 == 0) {
                continue;
            }
            if (i > 10) {
                break;
            }
            System.out.print(i + " " + "\n");
        }
    }
}