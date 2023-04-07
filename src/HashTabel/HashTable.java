package HashTabel;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable<K, V> {
    private ArrayList<LinkedList<Entry<K, V>>> table;
    private int capacity;
    private int size;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (LinkedList<Entry<K, V>> list : table) {
            for (Entry<K, V> entry : list) {
                sb.append(entry.getKey() + "=" + entry.getValue() + ", ");
            }
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2); // remove the last ", "
        }
        sb.append("}");
        return sb.toString();
    }

    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            table.add(new LinkedList<>());
        }
        size = 0;
    }

    public void put(K key, V value) {
        int hash = hash(key);
        LinkedList<Entry<K, V>> list = table.get(hash);
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        list.add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int hash = hash(key);
        LinkedList<Entry<K, V>> list = table.get(hash);
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = hash(key);
        LinkedList<Entry<K, V>> list = table.get(hash);
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                list.remove(entry);
                size--;
                return;
            }
        }
    }

    public boolean containsKey(K key) {
        int hash = hash(key);
        LinkedList<Entry<K, V>> list = table.get(hash);
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (LinkedList<Entry<K, V>> list : table) {
            for (Entry<K, V> entry : list) {
                if (entry.getValue().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (LinkedList<Entry<K, V>> list : table) {
            list.clear();
        }
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    private static class Entry<K, V> {
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

        public void setValue(V value) {
            this.value = value;
        }
    }
}