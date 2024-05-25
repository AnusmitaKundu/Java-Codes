import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class InstanceOfTutorial {
    static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }
        String ret = "Student=" + Integer.toString(a) + "\n" + "Rockstar=" + Integer.toString(b) + "\n" + "Hacker="
                + Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("Student"))
                mylist.add(new Student());
            if (s.equals("Rockstar"))
                mylist.add(new Rockstar());
            else
                mylist.add(new Hacker());
        }
        System.out.println("Elements in List are:\n" + count(mylist));
        sc.close();
    }
}
