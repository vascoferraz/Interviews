package org.vascoferraz.interviews.codility.lessons.countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {

        int[] array = {1, 3, 6, 4, 1, 5, 2};
        int k = 3;
        System.out.println(solution(k, array));
    }

    public static int solution(int X, int[] A) {

        Set<Integer> hashset = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                hashset.add(A[i]);
            }
            if (hashset.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
