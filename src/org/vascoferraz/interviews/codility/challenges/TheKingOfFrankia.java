package org.vascoferraz.interviews.codility.challenges;

public class TheKingOfFrankia {

    public static void main(String[] args) {
        //int[] array = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        int[] array = {-3, -3, -3, -4};
        solution(array);
    }

    public static int solution(int[] A) {

        int count = 2;

        // Keeping only one element of consecutive values
        int j = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[j] != A[i]) {
                j++;
                A[j] = A[i];
            }
        }

        // If the array has only one element or elements of the same number, then return 1.
        // Examples: {3} or {4, 4, 4} should return 1.
        if (j == 0) {
            return 1;
        }

        for (int i = 1; i < j; i++) {

            if (A[i] > A[i + 1] && A[i] > A[i - 1]) {
                count++;
            }

            if (A[i] < A[i + 1] && A[i] < A[i - 1]) {
                count++;
            }
        }

        //System.out.println("Count: " + count);
        return count;
    }
}
