package org.vascoferraz.interviews.codility.lessons.timecomplexity;

import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {

        int[] array = {2, 3, 1, 4, 5, 6};
        solution(array);
    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {

            if (A[i] != i + 1) {
                //System.out.println(i + 1);
                return i + 1;
            }
        }
        //System.out.println(A.length + 1);
        return A.length + 1;
    }
}
