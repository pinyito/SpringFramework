package com.eriapinyiothieno.srpingframework;

public class BinarySearchImpl {
    //Demonstrating the concept of tight and loose coupling

    //1. Sort array
        //BubbleSort Algorithm
//    BubbleSort bubbleSort = new BubbleSort();
        //Quick sort Algorithm
//    QuickSort quickSort = new QuickSort();
    //Using an interface further detaches the sorting algorithm to allow flexibility in using various sorting algorithms
//    SortingAlgorithm sortingAlgorithm = new BubbleSort();
//    SortingAlgorithm sortingAlgorithm = new QuickSort();
    private SortingAlgorithm sortAlgo;
    public BinarySearchImpl(SortingAlgorithm sortAlgo){
        this.sortAlgo = sortAlgo;
    }
    //2. Search array
    public int binarySearch(int[] numbers, int number){
//        bubbleSort.bubbleSortAlgo();
//        quickSort.quickSortAlgo();
//        sortingAlgorithm.sortAlgo();
//        sortingAlgorithm.sortAlgo();
        sortAlgo.sortAlgo();
        return 3;
    }
    //3. Return result

}
