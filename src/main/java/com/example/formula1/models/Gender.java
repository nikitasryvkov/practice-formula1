package com.example.formula1.models;

public enum Gender {

  MALE(1),
  FEMALE(2);

  private final int index;
  Gender (int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

}
