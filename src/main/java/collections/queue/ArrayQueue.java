package collections.queue;

//to be continued
public class ArrayQueue<E> implements Queue<E> {

    private int head;
    private int tail;
    private Object[] elements;

    ArrayQueue(int capacity){
        this.elements = new Object[capacity];
        this.head = 0;
        this.tail = 0;
    }

    @Override
    public void add(E element) {
        elements[tail++] = element;
    }

    @Override
    public E remove() {
        return (E) elements[head++];
    }

    @Override
    public int size() {
        return tail-head;
    }
}
