package org.vascoferraz.interviews.removeduplicates;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // The array must be sorted.
        // If the array is not sorted use the sort method.
        Integer[] array = {0, 1, 1, 2, 1, 1, 5 ,5};

        for (int i = 0; i < array.length-1; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    array[j] = null;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
