package collections.queue;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayQueueTest {

    private static final int CAPACITY = 5;

    @Test
    public void whenCheckingSizeOfEmptyQueue_expectedResultIs0(){
        Queue<String> queue = new ArrayQueue<>(CAPACITY);
        assertThat(queue.size()).isEqualTo(0);
    }

    @Test
    public void whenCheckingSizeOfQueueWithOneElementAdded_expectedResultIs1() {
        Queue<String> queue = new ArrayQueue<>(CAPACITY);
        queue.add("item1");
        assertThat(queue.size()).isEqualTo(1);
    }

    @Test
    public void whenCheckingSizeOfQueueWith3ElementsAdded_expectedResultIs3(){
        Queue<String> queue = new ArrayQueue<>(CAPACITY);
        queue.add("item1");
        queue.add("item2");
        queue.add("item3");
        assertThat(queue.size()).isEqualTo(3);
    }

    @Test
    public void whenCheckingSizeOfQueueWith5ElementsAdded_expectedResultIs5(){
        Queue<String> queue = new ArrayQueue<>(CAPACITY);
        queue.add("item1");
        queue.add("item2");
        queue.add("item3");
        queue.add("item4");
        queue.add("item5");
        assertThat(queue.size()).isEqualTo(5);
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void whenAddingToQueueMoreElementThenCapacity_expectArrayIndexOutOfBoundsExceptionToBeThrown(){
        Queue<String> queue = new ArrayQueue<>(CAPACITY);
        queue.add("item1");
        queue.add("item2");
        queue.add("item3");
        queue.add("item4");
        queue.add("item5");
        queue.add("item6");
        assertThat(queue.size()).isEqualTo(6);
    }

    @Test
    public void whenRemovingOneElementFromQueueWithOneElement_expectedSizeOfQueueIs0(){
        Queue<String> queue = new ArrayQueue<>(CAPACITY);
        queue.add("item1");
        queue.remove();
        assertThat(queue.size()).isEqualTo(0);
    }

    @Test
    public void whenAddingOneElementToEmptyQueueAndRemovingElementFromQueue_expectedAddedAndRemovedElementToBeEquals(){
        Queue<String> queue = new ArrayQueue<>(CAPACITY);
        String expectedElement = "item1";
        queue.add(expectedElement);
        String actualElement = queue.remove();
        assertThat(actualElement).isEqualTo(expectedElement);
    }

}