package com.erojas.core.poo.abstracts;

/**
 * As you move up the inheritance hierarchy, classes become more general and probably more abstract.
 */
public abstract class Person {
  public abstract String getDescription();

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
