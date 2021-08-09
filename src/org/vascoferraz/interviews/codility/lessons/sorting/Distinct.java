package org.vascoferraz.interviews.codility.lessons.sorting;

import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {

        //int[] array = {-2, -1, 2, 3, 1, 0, 5, 6, 7};
        int[] array = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(array));
    }

    public static int solution(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        Arrays.sort(A);
        int result = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1]) {
                result++;
            }
        }
        return result;
    }
}
