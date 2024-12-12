package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SortManageTest {

  @Test
  public void testConstructorWithNullList() {
    List<StrategySort> strategies = null;
    assertThrows(IllegalArgumentException.class, () -> new SortManage(strategies));
  }

  @Test
  public void testConstructorWithEmptyList() {
    List<StrategySort> strategies = Collections.emptyList();
    assertThrows(IllegalArgumentException.class, () -> new SortManage(strategies));
  }

  @Test
  public void testSortWithNonExistingAlgorithm() {
    List<StrategySort> strategies = Arrays.asList(new StrategySort() {
      public String chooseStrategy() {
        return "TestStrategy";
      }
      public List<Integer> sort(List<Integer> list) {
        return list;
      }
    });
    SortManage sortManage = new SortManage(strategies);
    List<Integer> list = Arrays.asList(56, 98, 99);
    assertThrows(IllegalArgumentException.class, () -> sortManage.sort(list, "NonExistingAlgorithm"));
  }
}
