package org.vascoferraz.interviews.codility.lessons.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public static void main(String[] args) {

        int[] array = {-100, -2, 3, 1, 2};
        System.out.println(solution(array));
    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        int maxWithNegatives = A[0] * A[1] * A[A.length - 1];
        int maxWithPositives = A[A.length - 1] * A[A.length - 2] * A[A.length- 3];

        return maxWithNegatives > maxWithPositives ? maxWithNegatives : maxWithPositives;
    }
}
