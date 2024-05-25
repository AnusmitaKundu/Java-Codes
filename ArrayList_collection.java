import java.util.*;

public class ArrayList_collection {
    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();

        a.add(10);
        a.add(10.23);
        a.add("hello");
        System.out.println(a);

        a.remove(0); // index wise
        System.out.println(a);

        // int s = a.size();
        System.out.println(a.size());

    }
}