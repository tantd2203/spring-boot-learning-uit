package com.programming.javacore.TightCoupling;

public class BubbleSortAlgorithm {
    public void sort(int[] array) {
        // TODO: Add your sorting logic here
        System.out.println("Sorted using bubble sort algorithm");
    }
}

class VeryComplexService {
    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

    public VeryComplexService() {
    }

    public void complexBusiness(int[] array) {
        bubbleSortAlgorithm.sort(array);
        // TODO: More business logic here
    }
}