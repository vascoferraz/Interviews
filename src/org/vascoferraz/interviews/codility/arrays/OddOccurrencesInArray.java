package org.vascoferraz.interviews.codility.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        //int[] array = {42, 100, 42, 100, 100000};
        //int[] array =  {9, 3, 9, 3, 9, 7, 9};
        int[] array = {42};
        solution(array);
    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        if (A.length == 1) {
            //System.out.println(A[0]);
            return A[0];
        }

        for (int i = 0; i < A.length - 1; i = i + 2) {

            if (A[i] != A[i + 1]) {
                //System.out.println(A[i]);
                return A[i];
            }
        }

        //System.out.println(A[A.length-1]);
        return A[A.length - 1];
    }
}
