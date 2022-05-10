package com.eriapinyiothieno.srpingframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkApplication.class, args);

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		int result = binarySearch.binarySearch(new int[]{12, 4, 3}, 3);
		System.out.println(result);
	}

}
