package crossover;

public class Derived extends Base {

    static {
        System.out.println("Derived 2 static constructor");
    }

    static {
        System.out.println("Derived 1 static constructor");
    }

    {
        System.out.println("Derived 2 anonymous constructor");
    }

    {
        System.out.println("Derived 1 anonymous constructor");
    }

    public Derived() {
        System.out.println("Derived constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Derived d = new Derived();
    }
}
