package ru.tisov.denis.test;

import org.junit.Assert;
import org.junit.Test;

public class ToStringTest {

    @Test
    public void test() {
        ToStringTest object1 = new ToStringTest();
        ToStringTest object2 = new ToStringTest();

        System.out.println(object1.toString());
        System.out.println(object2.toString());
        Assert.assertEquals(object1.toString(), object2.toString());
    }
    
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + 4;
        return result;

    }

}