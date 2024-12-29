package com.erojas.core.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Setter=mutator
 * Getter=accessor
 */
public class MutatorAccesor {


  public static void main(String[] args) {
    test_accessor();
    test_final();
  }

  public static void test_final() {
    final List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Jane");
    System.out.println(names.size());
    names.remove(0);
    System.out.println(names.size());

    //Error new instance
    //names = new ArrayList<>();
  }

  public static void test_accessor() {
    // Date immutable
    LocalDate originalDate = LocalDate.of(2024, 12, 28);
    System.out.println("Original date: " + originalDate);

    LocalDate newDate = originalDate.plusDays(5);
    System.out.println("New date + 5 days: " + newDate);

    // Original date
    System.out.println("Original date without modifications: " + originalDate);

    // Another new date
    LocalDate anotherNewDate = originalDate.withYear(2025);
    System.out.println("Another new date with 2025 year: " + anotherNewDate);
  }
}
