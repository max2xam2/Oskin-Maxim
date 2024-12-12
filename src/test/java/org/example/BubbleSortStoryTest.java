package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BubbleSortStoryTest {

  @Test
  void visualTestSortingOperation() {
    BubbleSortStory bubbleSortStory = new BubbleSortStory(8);
    List<Integer> input = Arrays.asList(18, 5, 9, 2, 1, 4, 23765, 12);
    List<Integer> response = Arrays.asList(1, 2, 4, 5, 9, 12, 18, 23765);

    List<Integer> sortedList = bubbleSortStory.sort(input);

    assertEquals(response, sortedList);
  }

  @Test
  void errorMaximumLengthExceeded() {
    BubbleSortStory bubbleSortStory = new BubbleSortStory(20);
    List<Integer> input = Arrays.asList(18, 5, 9, 2, 1, 4, 23765, 12, 30, 40, 50, 67, 987, 374, 297, 9732, 9376, 56, 90, 4666, 888);
    MaxSizeSortArray exception = assertThrows(MaxSizeSortArray.class, () -> {
      bubbleSortStory.sort(input);
    });
    assertEquals("The list is too big to sort", exception.getMessage());
  }

  @Test
  void emptySortList() {
    BubbleSortStory bubbleSortStory = new BubbleSortStory(20);
    List<Integer> input = Collections.emptyList();
    MaxSizeSortArray exception = assertThrows(MaxSizeSortArray.class, () -> bubbleSortStory.sort(input));
    assertEquals("The sorting list cannot be empty", exception.getMessage());
  }
}
