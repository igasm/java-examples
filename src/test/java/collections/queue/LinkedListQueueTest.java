package collections.queue;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListQueueTest {

    @Test
    public void whenCreatingNewQueue_expectSizeEquals0(){
        Queue<String> queue = new LinkedListQueue<>();
        assertThat(queue.size()).isEqualTo(0);
    }

    @Test
    public void whenAddingOneElementToEmptyQueue_expectedSizeEquals1(){
        Queue<String> queue = new LinkedListQueue<>();
        queue.add("item1");
        assertThat(queue.size()).isEqualTo(1);
    }

    @Test
    public void whenAddingElementToEmptyQueueAndRemovingElement_expectedElementsToBeEqual(){
        Queue<String> queue = new LinkedListQueue<>();
        String element = "item1";
        queue.add(element);
        assertThat(element).isEqualTo(queue.remove());
    }

    @Test
    public void whenAddingTwoElementsToEmptyQueue_expectedSizeEquals2(){
        Queue<String> queue = new LinkedListQueue<>();
        queue.add("item1");
        queue.add("item2");
        assertThat(queue.size()).isEqualTo(2);
    }

    @Test
    public void whenAddingTwoElementsToEmptyQueueAndRemovingOneElement_expectedRemovedElementToBeEqualToTheFirstOne(){
        Queue<String> queue = new LinkedListQueue<>();
        String firstElement = "item1";
        queue.add(firstElement);
        String secondElement = "item2";
        queue.add(secondElement);
        String firstRemoved = queue.remove();
        String secondRemoved = queue.remove();
        assertThat(firstElement).isEqualTo(firstRemoved);
    }

    @Test
    public void whenAddingTwoElementsToEmptyQueueAndRemovingTwoElements_expectedSecondRemovedElementToBeEqualToTheSecondOneAdded(){
        Queue<String> queue = new LinkedListQueue<>();
        String firstElement = "item1";
        queue.add(firstElement);
        String secondElement = "item2";
        queue.add(secondElement);
        String firstRemoved = queue.remove();
        String secondRemoved = queue.remove();
        assertThat(secondElement).isEqualTo(secondRemoved);
    }

}