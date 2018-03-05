package interview.cracking;

import interview.cracking.datastructures.hashtable1.MyHashMap;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyHashMapTest {
    @Test
    public void put() throws Exception {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        Assert.assertEquals((long) map.put("one", 11), 1);
    }

    @Test
    public void get() throws Exception {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        assertEquals((long) map.get("one"), 1);
    }

    @Test
    public void contains() throws Exception {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        Assert.assertFalse(map.contains("one"));
        map.put("one", 1);
        Assert.assertTrue(map.contains("one"));
    }

}