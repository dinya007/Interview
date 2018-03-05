package interview.cracking.datastructures.hashtable1;

import java.util.HashMap;

public class MyHashMap<K, V> {

    private int capacity;
    private HashTableLinkedList[] values;

    public MyHashMap() {
        this(20);
    }

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        values = new HashTableLinkedList[capacity];
        for (int i = 0; i < values.length; i++) {
            values[i] = new HashTableLinkedList();
        }
        new HashMap();
    }

    public V put(K key, V value) {
        Entry<K, V> entry = (Entry<K, V>) values[hash(key)].put(new Entry<>(key, value));
        if (entry == null) return null;
        return entry.getValue();

    }

    public V get(K key) {
        return ((Entry<K, V>) values[hash(key)].get(new Entry<>(key, null))).getValue();
    }

    public boolean contains(K key) {
        return values[hash(key)].contains(new Entry<>(key, null));
    }

    public static class Entry<K, V> {

        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Entry<?, ?> entry = (Entry<?, ?>) o;

            return key != null ? key.equals(entry.key) : entry.key == null;

        }

        @Override
        public int hashCode() {
            return key != null ? key.hashCode() : 0;
        }
    }

    private int hash(K key) {
        if (key == null) return 0;
        return key.hashCode() % capacity;
    }


}
