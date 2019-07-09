package Lectutre_15;


public class Generic_linkedlist<T extends Comparable<T>> {

    private Node head;
    private Node tail;

    private int size;

    public void insertFirst(T value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(T value) {
        if (size == 0) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        //increase size
        size++;
    }

    public T deleteFirst() throws Exception {
        if (size == 0) {
            throw new Exception("Removing from empty list");
        }
        T value = head.value;
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
        return value;
    }

    public T deleteLast() throws Exception {
        if (size < 2) {
            return deleteFirst();
        }
        Node node = head;
        while (node.next != tail) {
            node = node.next;
        }
        T value = tail.value;
        node.next = null;
        tail = node;
        size--;
        return value;
    }

    public Node getNode(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bound");
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node;
    }

    public void insert(int index, T value) throws Exception {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node prev = getNode(index - 1);
        Node node = new Node(value, prev.next);
        prev.next = node;
        size++;
    }

    public T delete(int index) throws Exception {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = getNode(index - 1);
        T value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + ", ");
            node = node.next;

        }
        System.out.println("end \b");
    }

    public void reverse() {
        if (size < 2) {
            return;


        }
        //  reverse(head);
        Node prev = null;
        Node present = head;
        Node next = head.next;
        tail = head;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = prev;
            if (next != null) {
                next = next.next;
            }

        }
    }

    private void reverse(Node node) {
        if (node.next == null) {
            head = tail;
            return;

        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

  //  public Generic_linkedlist<T>;s

    private class Node {

        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}







