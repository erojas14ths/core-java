package com.erojas.core.poo.packages.extenal;

import com.erojas.core.poo.packages.base.BasePublicComponent;

public class ExternalPublicComponentApp {
  public static void main(String[] args) {
    var top = new BasePublicComponent("I'm a top");
    System.out.println(top.text);
  }
}
