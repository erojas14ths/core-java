package com.erojas.core.poo.inheritance;

/**
 * Preventing Inheritance: The final Modifier
 */
public final class Programmer extends Employee {
  private String language;

  public Programmer(String name, double salary, int year, int month, int day) {
    super(name, salary, year, month, day);
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
