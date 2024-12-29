package com.erojas.core.fundamental.textblocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TextBlocksTest {

  @Test
  @DisplayName("TextBlocks: lines count")
  void lines_count() {
    var greeting = """
      Hello
      World
      """;
    System.out.println(greeting);
    Assertions.assertEquals(2, greeting.lines().count());
  }


}
