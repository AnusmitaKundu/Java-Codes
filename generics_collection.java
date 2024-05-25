import java.util.*;

public class generics_collection {
    public static void main(String[] args) {
        // Using generics with ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);

        // Using a raw ArrayList (without generics)
        ArrayList list2 = new ArrayList();
        list2.add(10);
        list2.add(3.14);
        list2.add("1000");

        // Accessing elements from the raw ArrayList requires casting
        int a = (int) list2.get(0);
        System.out.println("List 2: " + list2);
        System.out.println("Value at index 1 in list2: " + a);

        // Using generics with ArrayList is type-safe and avoids the need for casting
        System.out.println("List 1: " + list);
    }
}
