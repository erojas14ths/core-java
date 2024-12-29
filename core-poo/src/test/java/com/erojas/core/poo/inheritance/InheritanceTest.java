package com.erojas.core.poo.inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InheritanceTest {
  @Test
  @DisplayName("Inheritance: Polymorphism")
  void person() {
    Employee e;
    // construct a Manager object
    var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
    boss.setBonus(5000);
    var backend = new Programmer("Harry Java", 50000, 1989, 10, 1);
    backend.setLanguage("Java");
    var frontend = new Programmer("Tommy Angular", 40000, 1990, 3, 15);
    frontend.setLanguage("Angular");
    // print out information about all Employee objects
   System.out.println(boss.toString());
   System.out.println(backend);
   System.out.println(frontend);
  }

}
