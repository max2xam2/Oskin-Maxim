package org.example;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortStory implements StrategySort {
  private final int maxElementsSize;

  public BubbleSortStory(int maxElementsSize) {
    this.maxElementsSize = maxElementsSize;
  }

  public List<Integer> sort(List<Integer> list) throws MaxSizeSortArray {
    if (list.size() > this.maxElementsSize) {
      throw new MaxSizeSortArray("The list is too big to sort");
    }

    if (list.isEmpty()) {
      throw new MaxSizeSortArray("The sorting list cannot be empty");
    }

    List<Integer> sortedList = new ArrayList<>(list);
    for (int i = 0; i < sortedList.size() - 1; i++) {
      for (int j = 0; j < sortedList.size() - i - 1; j++) {
        if (sortedList.get(j) > sortedList.get(j + 1)) {
          int temp = sortedList.get(j);
          sortedList.set(j, sortedList.get(j + 1));
          sortedList.set(j + 1, temp);
        }
      }
    }
    return sortedList;
  }

  public String chooseStrategy() {
    return "BubbleSort";
  }
}
