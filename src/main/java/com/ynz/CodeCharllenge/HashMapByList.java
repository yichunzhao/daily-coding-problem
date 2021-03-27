package com.ynz.CodeCharllenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * how to implement a hashMap by a List
 */
public class HashMapByList {

    public static void main(String[] args) {
        String key = "this";
        String key1 = "is";
        System.out.println("hashcode : " + key.hashCode());
        System.out.println("hashcode : " + key1.hashCode());

        MyHashMap<String, Integer> myMap = new MyHashMap<>();
        myMap.put(key, 100);
        myMap.put(key1, 200);

        System.out.println("get key value back: " + myMap.get(key));
        System.out.println("get key1 value back: " + myMap.get(key1));
    }

    static class MyHashMap<K, V> {
        private static final int INITIAL_SIZE = 16;
        private List<Entry<K, V>> list = new ArrayList<>(INITIAL_SIZE);

        {
            IntStream.range(0, 16).forEach(i -> list.add(new Entry('s', i)));
        }

        public void put(K key, V value) {
            //key hashcode to int
            int index = key.hashCode() & (INITIAL_SIZE - 1);
            list.add(index, new Entry(key, value));
        }

        public V get(K key) {
            int index = key.hashCode() & (INITIAL_SIZE - 1);
            return list.get(index).getValue();
        }

    }

    static class Entry<K, V> {
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
    }

}
