package com.erojas.core.poo.record;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PointTest {

  @Test
  @DisplayName("Record: Point immutable")
  void point() {
    var p = new Point(3, 4);
    System.out.println(p);
    Assertions.assertEquals(3, p.x());
    Assertions.assertEquals(4, p.y());
  }

  @Test
  @DisplayName("Record: Point immutable with reassign")
  void point2() {
    var p = new Point(3, 4);
    System.out.println(p);
    Assertions.assertEquals(3, p.x());
    Assertions.assertEquals(4, p.y());

    p = new Point(30, 40);
    System.out.println(p);
    Assertions.assertEquals(30, p.x());
    Assertions.assertEquals(40, p.y());
  }
}
