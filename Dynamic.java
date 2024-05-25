class ABC {
    void display() {
        System.out.println("This is ABC");
    }
}

class DEF extends ABC {
    void display() { // display of class ABC is getting overridden
        System.out.println("This is DEF");
    }
}

class PQR extends DEF {
} // display of class PQR is not overridden

class XYZ extends PQR {
    void display() { // display of class DEF is getting overridden
        System.out.println("This is XYZ");
    }
}

public class Dynamic {
    public static void main(String args[]) {
        DEF ob = new DEF();
        ob.display();
        // ob = new ABC(); // the ob is now pointing to the DEF class
        // ob.display();
        ob = new PQR(); // the ob is now pointing to the PQR class
        ob.display();
        ob = new XYZ(); // the ob is now pointing to the XYZ class
        ob.display();
    }
}
