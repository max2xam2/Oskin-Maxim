package org.example;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

  private final List<Integer> array;
  private final String algorithmName;

  public SelectionSort(List<Integer> array, String algorithmName) {
    this.array = new ArrayList<>(array);
    this.algorithmName = algorithmName;
  }

  public List<Integer> getNumbers() {
    return new ArrayList<>(array);
  }

  public String getAlgorithmName() {
    return algorithmName;
  }

  public String toString() {
    return "SortResult list=" + array + ", Algorithm='" + algorithmName + "'";
  }

  public List<Integer> sort() {
    List<Integer> sortedList = new ArrayList<>(array);

    for (int i = 0; i < sortedList.size() - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < sortedList.size(); j++) {
        if (sortedList.get(j) < sortedList.get(minIndex)) {
          minIndex = j;
        }
      }
      int temp = sortedList.get(i);
      sortedList.set(i, sortedList.get(minIndex));
      sortedList.set(minIndex, temp);
    }
    return sortedList;
  }
}
