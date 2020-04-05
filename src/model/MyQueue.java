package model;

public class MyQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int numNodes;

    public MyQueue() {}

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public int size() {
        return numNodes;
    }

    public Node<E> get(int index) {
        Node<E> current = head;
        for (int indexList = 0; indexList < index; indexList++) {
            current = current.next;
        }
        return current;
    }

    public void enqueue(E data) {
        Node<E> newNode = new Node<>(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        numNodes++;
    }

    public Node<E> dequeue() {
        if (head == null) {
            return null;
        }
        Node<E> node = head;
        head = head.next;
        tail.next = head;
        if (head == null) {
            tail = null;
        }
        return node;
    }
}
