package LinkedList;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void addAtIndex(int index, T data) {
        Node<T> newNode = new Node<T>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> currentNode = head;
            int currentIndex = 0;
            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            if (currentNode != null) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }
    }

    public boolean remove(T data) {
        if (head == null) {
            return false;
        } else if (head.data.equals(data)) {
            head = head.next;
            return true;
        } else {
            Node<T> current = head;
            while (current.next != null && !current.next.data.equals(data)) {
                current = current.next;
            }
            if (current.next != null && current.next.data.equals(data)) {
                current.next = current.next.next;
                return true;
            } else {
                return false;
            }
        }
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

