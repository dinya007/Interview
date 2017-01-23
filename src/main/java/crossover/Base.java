package crossover;

public class Base {

    static {
        System.out.println("Base static constructor");
    }

    {
        System.out.println("Base anonymous constructor");
    }

    public Base() {
        System.out.println("Base constructor");
    }
}
