package org.example;

import java.util.List;

public interface StrategySort {
  List<Integer> sort(List<Integer> list) throws Exception;
  String chooseStrategy();
}
