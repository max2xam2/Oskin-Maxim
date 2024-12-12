package org.example;

import java.util.List;

public class SortManage {
  private final List<StrategySort> strategies;

  public SortManage(List<StrategySort> strategies) throws IllegalArgumentException {
    if (strategies == null || strategies.isEmpty()) {
      throw new IllegalArgumentException("The list of sorting algorithms cannot be empty");
    }
    this.strategies = strategies;
  }

  public List<Integer> sort(List<Integer> list, String algorithmName) throws Exception {
    if (list == null) {
      throw new IllegalArgumentException("The list to sort cannot be null");
    }

    for (StrategySort strategy : strategies) {
      if (strategy.chooseStrategy().equalsIgnoreCase(algorithmName)) {
        return strategy.sort(list);
      }
    }

    throw new IllegalArgumentException("The sorting algorithm with the name " + algorithmName + " not found.");
  }
}
