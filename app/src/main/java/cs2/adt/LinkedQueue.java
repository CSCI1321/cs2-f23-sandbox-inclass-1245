package cs2.adt;

public class LinkedQueue<T> implements Queue<T> {
  private class Node {
    public T data;
    public Node next;
    public Node(T d, Node n) {
      data = d; next = n;
    }
  }

  private Node head;
  private Node tail;

  public LinkedQueue() {
    head = null;
    tail = null;
  }

  public void enqueue(T item) {
    tail.next = new Node(item, null);
    tail = tail.next;
  }
  public T dequeue() {
    T tmp = head.data;
    head = head.next;
    return tmp;
  }
  public T peek() {
    return head.data;
  }
  public boolean isEmpty() {
    return head == null && tail == null;
  }
}
