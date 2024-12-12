package org.example;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionSortTest {

  @Test
  public void testGetAlgorithmName() {
    List<Integer> input = Arrays.asList(5, 2, 8, 1, 9);
    SelectionSort selectionSort = new SelectionSort(input, "Selection Sort");
    String result = selectionSort.getAlgorithmName();
    assertEquals("Selection Sort", result);
  }
}
