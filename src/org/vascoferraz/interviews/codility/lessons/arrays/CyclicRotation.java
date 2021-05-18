package org.vascoferraz.interviews.codility.lessons.arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        int[] array = {1,2,3};
        solution(array, 2);
    }

    public static int[] solution(int[] A, int K) {

        if (A.length == 0) {
            return A;
        }

        int[] newArray = new int[A.length];

        if (K > A.length) {
            K = (K % A.length);
            //System.out.println(K);
        }

        if (K <= A.length) {
            K = A.length - K;
            K = (K % A.length);
            //System.out.println(K);
        }

        if (K == 0) {
            return A;
        }

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = A[K];
            //System.out.println(newArray[i]);
            K++;

            if (K == newArray.length) {
                K = 0;
            }
        }

        return newArray;
    }
}
