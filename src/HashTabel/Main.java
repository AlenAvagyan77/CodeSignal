package HashTabel;

import java.util.Hashtable;


public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        // method put()
        ht.put("A", 1);
        ht.put("B", 2);
        ht.put("C", 3);
        System.out.println("This is a Current HashTable : " + ht);
        // method get()
        int value = ht.get("A");
        System.out.println("Value of A = " + value);
        // method clone()
        ht.clone();
        System.out.println("Cloned  HashTable is a " + ht);
        // method containsKey()
        boolean keyExists = ht.containsKey("B");
        System.out.println("HashTable is contains Key of : " + keyExists);
        // method containsValue()
        boolean valueExist = ht.containsValue(5);
        System.out.println("HashTable is contains Value of : " + valueExist);
        // method size()
        int size = ht.size();
        System.out.println("Size of HashTable is a : " + size);
        // method isEmpty()
        boolean isEmpty = ht.isEmpty();
        System.out.println("HashTable  will be : " + isEmpty);
        // method clear()
        ht.clear();
        System.out.println("HashTable is : " + ht);
    }

}
