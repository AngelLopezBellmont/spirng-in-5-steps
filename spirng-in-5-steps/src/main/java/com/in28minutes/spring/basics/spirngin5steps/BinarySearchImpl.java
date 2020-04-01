package com.in28minutes.spring.basics.spirngin5steps;

import java.io.Serializable;

public class BinarySearchImpl  {

  private SortAlgorithm sortAlgorithm;

  public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
    this.sortAlgorithm = sortAlgorithm;
  }


  public BinarySearchImpl() {
//    super();
//    this.sortAlgorithm = sortAlgorithm;
  }

  public int binarySearch(int[] numbers, int numberToSearchFor) {
    int[] sortedNumbers = sortAlgorithm.sort(numbers);
    System.out.println(sortAlgorithm);
    return 3;
  }

  public int binarySearchWithInterface(int[] numbers, int numberToSearchFor, SortAlgorithm sortAlgorithm) {
    int[] sortedNumbers = sortAlgorithm.sort(numbers);
    System.out.println(sortAlgorithm);
    return 3;
  }
}
