package com.erojas.core.poo.record;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

  @Test
  @DisplayName("Record: Person with list")
  void person() {
    var friends = List.of("Juan", "Pepe");
    var p = new Person("Luis", friends);
    System.out.println(p);
  }

  @Test
  @DisplayName("Record: Person with list updated")
  void person2() {
    var friends = List.of("Juan", "Pepe");
    var p = new Person("Luis", friends);
    System.out.println(p);

    Assertions.assertThrows(UnsupportedOperationException.class, () -> {
      friends.add("Jaime");
    });
    Assertions.assertThrows(UnsupportedOperationException.class, () -> {
      p.friends().add("Jaime");
    });
  }

}
