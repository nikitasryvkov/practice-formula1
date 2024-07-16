package com.example.formula1.models;

public enum Position {

  FIRST(1),
  SECOND(2),
  RESERVE(3);

  private final int index;
  Position (int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

}
