package LinkedList;

import LinkedList.*;


public class Main {
    public static void main(String[] args) {
//        LinkedList<String> ll = new LinkedList<>();
//        ll.pop();
//        ll.add("Geeks");
//        ll.add(1, "For");
//        ll.add("Geeks :");
//        ll.add("Geeks");
//        ll.add(4, "For");
//        ll.add("Geeks");
//        System.out.println(ll);
//        for (int i = 0; i < ll.size(); i++) {
//            String eachElement = ll.get(i);
//            System.out.print(eachElement + " ");
//        }
//        System.out.println();
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        list.add(123);
//        list.add(12);
//        list.add(11);
//        list.add(1134);
//        System.out.println("LinkedList: " + list);
//        Object[] a = list.toArray();
//        System.out.print("After converted LinkedList to Array: ");
//        for (Object element : a)
//            System.out.print(element + " ");
//        System.out.println();
//        if(list.contains(123)){
//            System.out.println("The LinkedList contains 123" );
//        }else {
//            System.out.println("The LinkedList does not contain 123");
//        }
//        int index = list.indexOf(123);
//        System.out.println("The index of banana is: " + index);
//        int lastIndex = list.lastIndexOf(1134);
//        System.out.println("The last index of " + lastIndex);
//        Object[] array = list.toArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//
//        }
//
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("Instigate");
        linkedList.add("Mobile");
        linkedList.add("CJSC");
        linkedList.addAtIndex(3, "Branch");
        linkedList.addAtIndex(4, "Goris");
        linkedList.printList();




    }
}
