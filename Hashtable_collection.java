import java.util.*;

public class Hashtable_collection {
    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<>();

        // adding element
        h.put(1, "Apple");
        h.put(2, "Ball");
        h.put(3, "Cat");

        System.out.println("Hashtable: ");
        System.out.println(h);

        // removing element
        h.remove(2); // keywise

        System.out.println("Updated Hashtable: ");
        System.out.println(h);
    }
}