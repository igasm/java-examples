package collections.queue;

public class LinkedListQueue<E> implements Queue<E>{

    private Link head;
    private Link tail;
    private int size;

    LinkedListQueue(){
        this.size = 0;
    }

    @Override
    public void add(E element) {
        if(size==0){
            head = new Link();
            head.element = element;
        }

        size++;
    }

    @Override
    public E remove() {
        size--;
        return head.element;
    }

    @Override
    public int size() {
        return this.size;
    }

    private class Link{
        Link previous;
        E element;
        Link next;
    }
}
