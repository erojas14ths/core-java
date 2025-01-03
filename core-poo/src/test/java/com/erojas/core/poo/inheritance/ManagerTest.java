package com.erojas.core.poo.inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ManagerTest {
  @Test
  @DisplayName("Inheritance: Manager")
  void person() {
    // construct a Manager object
    var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
    boss.setBonus(5000);
    var staff = new Employee[3];
    // fill the staff array with Manager and Employee objects
    staff[0] = boss;
    staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
    staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
    // print out information about all Employee objects
    for (Employee e : staff) {
      System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
  }

}
