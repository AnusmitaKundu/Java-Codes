import java.util.*;

class MyGeneric<String, Integer> {
    int val;
    private String name;
    private Integer age;

    MyGeneric(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Name : " + name + " is of age: " + age);
    }

}

public class generics1 {
    public static void main(String[] args) {
        MyGeneric<String, Integer> obj = new MyGeneric<>("John", 25);
        obj.show();

    }
}
