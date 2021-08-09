package org.vascoferraz.interviews.codility.lessons.prefixsums;

public class CountDiv {

    public static void main(String[] args) {
        int A = 4;
        int B = 100;
        int K = 3;
        System.out.println(solution(A, B, K));
    }

    public static int solution(int A, int B, int K) {

        return (B/K - A/K) + ((A%K == 0) ? 1 : 0);
    }
}
