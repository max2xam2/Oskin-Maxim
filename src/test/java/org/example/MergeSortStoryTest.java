package org.example;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MergeSortStoryTest {

  @Test
  public void testSortListWithMultipleElements() throws MergeSortStory.MaxSizeSortArray {
    MergeSortStory mergeSortStory = new MergeSortStory(10);
    List<Integer> input = Arrays.asList(9, 12, 3, 12384675, 92);
    List<Integer> result = mergeSortStory.sort(input);
    List<Integer> expected = Arrays.asList(3, 9, 12, 92, 12384675);
    assertEquals(expected, result);
  }

  @Test
  public void testSortListWithMaxSizeExceeded() {
    MergeSortStory mergeSortStory = new MergeSortStory(10);
    List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    assertThrows(MergeSortStory.MaxSizeSortArray.class, () -> mergeSortStory.sort(input));
  }
}
