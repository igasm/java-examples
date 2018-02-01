package collections.queue;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListQueueTest {

  @Test
  public void whenCreatingNewQueue_expectSizeEquals0() {
    Queue<String> queue = new LinkedListQueue<>();
    assertThat(queue.size()).isEqualTo(0);
  }

  @Test
  public void whenAddingOneElementToEmptyQueue_expectedSizeEquals1() {
    Queue<String> queue = new LinkedListQueue<>();
    queue.add("item1");
    assertThat(queue.size()).isEqualTo(1);
  }

  @Test
  public void whenAddingElementToEmptyQueueAndRemovingElement_expectedElementsToBeEqual() {
    Queue<String> queue = new LinkedListQueue<>();
    String element = "item1";
    queue.add(element);
    assertThat(element).isEqualTo(queue.remove());
  }

  @Test
  public void whenAddingTwoElementsToEmptyQueue_expectedSizeEquals2() {
    Queue<String> queue = new LinkedListQueue<>();
    queue.add("item1");
    queue.add("item2");
    assertThat(queue.size()).isEqualTo(2);
  }

  @Test
  public void whenAddingTwoElementsToEmptyQueueAndRemovingOneElement_expectedRemovedElementToBeEqualToTheFirstOne() {
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
  public void whenAddingTwoElementsToEmptyQueueAndRemovingTwoElements_expectedSecondRemovedElementToBeEqualToTheSecondOneAdded() {
    Queue<String> queue = new LinkedListQueue<>();
    String firstElement = "item1";
    queue.add(firstElement);
    String secondElement = "item2";
    queue.add(secondElement);
    String firstRemoved = queue.remove();
    String secondRemoved = queue.remove();
    assertThat(secondElement).isEqualTo(secondRemoved);
  }

  @Test
  public void whenAdding3ElementsToEmptyQueueAndRemovingOneElement_expectedRemovedElementToBeEqualToTheFirstAdded() {
    Queue<String> queue = new LinkedListQueue<>();
    String firstElement = "item1";
    queue.add(firstElement);
    queue.add("item2");
    queue.add("item3");
    String firstRemoved = queue.remove();
    assertThat(firstElement).isEqualTo(firstRemoved);
  }

  @Test
  public void whenAdding3ElementsToEmptyQueueAndRemoving2Elements_expectedSecondRemovedElementToBeEqualToTheSecondOneAdded() {
    Queue<String> queue = new LinkedListQueue<>();
    queue.add("item1");
    String item2 = "item2";
    queue.add(item2);
    queue.add("item3");
    queue.remove();
    String secondRemoved = queue.remove();
    assertThat(item2).isEqualTo(secondRemoved);
  }

  @Test
  public void whenAdding3ElementsToEmptyQueueAndRemoving3Elements_expectedLastRemovedElementToBeEqualToTheLastOneAdded() {
    Queue<String> queue = new LinkedListQueue<>();
    queue.add("item1");
    queue.add("item2");
    String item3 = "item3";
    queue.add(item3);
    queue.remove();
    queue.remove();
    String thirdRemoved = queue.remove();
    assertThat(item3).isEqualTo(thirdRemoved);
  }

}