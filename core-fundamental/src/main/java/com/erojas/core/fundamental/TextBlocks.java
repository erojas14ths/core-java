package com.erojas.core.fundamental;

/**
 * Java 15.
 */
public class TextBlocks {

  public static void main(String[] args) {
    String greeting = """
      Hello
      World
      """;
    System.out.println(greeting);

    String html = """
      <div class="Warning">
         Beware of those who say "Hello" to the world
      </div>
      """;
    System.out.println(html);
  }
}
