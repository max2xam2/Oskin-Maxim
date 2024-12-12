package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    BubbleSortStory bubbleSortStory = new BubbleSortStory(20);
    MergeSortStory mergeSortStory = new MergeSortStory(10);
    System.out.println("Enter the number of items: ");

    int count = input.nextInt();
    List<Integer> list = new ArrayList<>();
    System.out.println("Enter the elements: ");
    for (int i = 0; i < count; i++) {
      list.add(input.nextInt());
    }

    System.out.println("MergeSort or BubbleSort)");
    String chooseSort = input.next();

    List<StrategySort> arraySort = new ArrayList<>();
    arraySort.add(bubbleSortStory);
    arraySort.add(mergeSortStory);
    StrategySort selectedSortStrategy = null;

    for (StrategySort strategy : arraySort) {
      if (strategy.chooseStrategy().equalsIgnoreCase(chooseSort)) {
        selectedSortStrategy = strategy;
        break;
      }
    }

    if (selectedSortStrategy == null) {
      System.out.println("Failure");
      return;
    }

    try {
      List<Integer> sortedList = selectedSortStrategy.sort(list);
      System.out.println("Отсортированный список: " + sortedList);
    } catch (MaxSizeSortArray array) {
      System.out.println("Mistake: " + array.getMessage());
    }
  }
}
