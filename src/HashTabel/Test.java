package HashTabel;

public class Test {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>(1);
        hashTable.put("A", 1);
        hashTable.put("B", 2);
        hashTable.put("C", 3);
        hashTable.put("D", 4);
        System.out.println("Main HashTable : " + hashTable);
        Integer key = hashTable.get("C");
        System.out.println("Key of HashTable is a : " + key);
        hashTable.remove("C");
        System.out.println("After removing " + hashTable);
        boolean isContainsKey = hashTable.containsKey("B");
        System.out.println(isContainsKey);
        boolean isContainsValue = hashTable.containsValue(1);
        System.out.println(isContainsValue);
        System.out.println("Size of HashTable : " + hashTable.size());
        boolean isEmpty = hashTable.isEmpty();
        System.out.println(isEmpty);
        hashTable.clear();
        System.out.println("HashTable is : " + hashTable);



    }
}
