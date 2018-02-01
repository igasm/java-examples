package collections.queue;

//to be continued...
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
        head.previous = null;
        head.next = null;
      }else if(size==1){
        tail = new Link();
        tail.element = element;
        tail.previous = head;
        tail.next = null;
        head.next = tail;
      }else{
        Link oldTail = tail;
        tail = new Link();
        tail.previous = oldTail;
        tail.element = element;
        tail.next = null;
      }

        size++;
    }

    @Override
    public E remove() {
      E removedElement = head.element;
      head = head.next;
      head.previous = null;
      size--;
      return removedElement;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString(){
      StringBuilder builder = new StringBuilder();
      Link currentLink = head;
      while(currentLink != null){
        builder.append(currentLink.element.toString()).append(", ");
        currentLink = currentLink.next;
      }
      return builder.toString();
    }

    private class Link{
        Link previous;
        E element;
        Link next;

        public String toString(){
          return element.toString();
        }
    }
}
