package org.example;

import java.util.List;
import java.util.ArrayList;

public class MergeSortStory implements StrategySort {

  private final int maxElementsSize;

  public int maxSizeList() {
    return maxElementsSize;
  }

  public MergeSortStory(int maxElementsSize) {
    this.maxElementsSize = maxElementsSize;
  }

  public List<Integer> sort(List<Integer> list) throws MaxSizeSortArray {
    if (list.size() > this.maxElementsSize) {
      throw new MaxSizeSortArray("The list is too long: " + maxElementsSize);
    }
    return mergeSort(list);
  }


  private List<Integer> mergeSort(List<Integer> list) {
    if (list.size() <= 1) {
      return list;
    }
    if (list.isEmpty()) {
      throw new org.example.MaxSizeSortArray("The sorting list cannot be empty");
    }

    int mid = list.size() / 2;
    List<Integer> left = new ArrayList<>(list.subList(0, mid));
    List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

    List<Integer> sortedLeft = mergeSort(left);
    List<Integer> sortedRight = mergeSort(right);

    return merge(sortedLeft, sortedRight);
  }

  private List<Integer> merge(List<Integer> left, List<Integer> right) {
    List<Integer> result = new ArrayList<>();
    int i = 0, j = 0;

    while (i < left.size() && j < right.size()) {
      if (left.get(i) <= right.get(j)) {
        result.add(left.get(i));
        i++;
      } else {
        result.add(right.get(j));
        j++;
      }
    }

    while (i < left.size()) {
      result.add(left.get(i));
      i++;
    }

    while (j < right.size()) {
      result.add(right.get(j));
      j++;
    }

    return result;
  }

  public String chooseStrategy() {
    return "MergeSort";
  }

  public TypeOfSorting type() {
    return TypeOfSorting.MergeSort;
  }

  public static class MaxSizeSortArray extends Exception {
    public MaxSizeSortArray(String message) {
      super(message);
    }
  }
}
