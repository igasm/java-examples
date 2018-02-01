package collections.queue;

public class LinkedListQueue<E> implements Queue<E> {

  private Node head;
  private Node tail;
  private int size;

  LinkedListQueue() {
    this.size = 0;
  }

  @Override
  public void add(E element) {
    if (size == 0) {
      head = new Node();
      head.element = element;
      head.previous = null;
      head.next = null;
    } else if (size == 1) {
      tail = new Node();
      tail.element = element;
      tail.previous = head;
      tail.next = null;
      head.next = tail;
    } else {
      Node oldTail = tail;
      tail = new Node();
      tail.previous = oldTail;
      tail.element = element;
      tail.next = null;
      oldTail.next = tail;
    }
    size++;
  }

  @Override
  public E remove() {
    E removedElement = head.element;
    head = head.next;
    if (head != null) {
      head.previous = null;
    }
    size--;
    return removedElement;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    Node currentLink = head;
    while (currentLink != null) {
      builder.append(currentLink.element.toString()).append(", ");
      currentLink = currentLink.next;
    }
    return builder.toString();
  }

  private class Node {
    Node previous;
    E element;
    Node next;

    public String toString() {
      return element.toString();
    }
  }
}
