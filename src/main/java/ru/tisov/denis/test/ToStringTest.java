package ru.tisov.denis.test;

public class ToStringTest {

    public static void main(String[] args) {
        ToStringTest object1 = new ToStringTest();
        ToStringTest object2 = new ToStringTest();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + 4;
        return result;
    }

}
