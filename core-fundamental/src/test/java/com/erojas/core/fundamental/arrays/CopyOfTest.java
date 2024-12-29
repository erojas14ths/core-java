package com.erojas.core.fundamental.arrays;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CopyOfTest {

  @Test
  @DisplayName("TextBlocks: lines count")
  void lines_count() {
    String[] original = {"apple", "banana", "cherry"};
    String[] newArray = Arrays.copyOf(original, 5);

    System.out.println(Arrays.toString(original));
    System.out.println(Arrays.toString(newArray));
    Assertions.assertEquals(original[0], newArray[0]);
    Assertions.assertEquals(original[1], newArray[1]);
    Assertions.assertEquals(original[2], newArray[2]);
  }

}
