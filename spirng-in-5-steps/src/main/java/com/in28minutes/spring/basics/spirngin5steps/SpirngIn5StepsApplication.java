package com.in28minutes.spring.basics.spirngin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpirngIn5StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpirngIn5StepsApplication.class, args);

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int i1 = binarySearch.binarySearch(new int[]{12,4,6}, 3);
 		BinarySearchImpl binarySearchWithOutInterface = new BinarySearchImpl();
		int i2 = binarySearchWithOutInterface.binarySearchWithInterface(new int[] {12, 4, 6 }, 3, new QuickSortAlgorithm());
		int i3 = binarySearchWithOutInterface.binarySearchWithInterface(new int[] {12, 4, 6 }, 3, new BubbleSortAlgorithm());
		// System.out.println(i1);
		// System.out.println(i2);
	}

}
