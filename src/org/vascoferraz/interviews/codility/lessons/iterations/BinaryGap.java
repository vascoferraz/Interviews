package org.vascoferraz.interviews.codility.iterations;

public class BinaryGap {

    public static void main(String[] args) {
        solution(1040);
    }

    public static int solution(int N) {

        char[] chars = Integer.toBinaryString(N).toCharArray();
        int ones = 0;
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                ones++;
            }
        }

        int[] charWithOnes = new int[ones];
        int gap = 1;
        //System.out.println(chars);

        if (N <= 4) {
            return 0;
        }

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '1') {
                charWithOnes[counter] = i;
                counter++;
                //System.out.println(i);
            }
        }

        for (int i = 0; i < charWithOnes.length - 1; i++) {

            if (charWithOnes[i+1] - charWithOnes[i] > gap) {
                gap = charWithOnes[i+1] - charWithOnes[i];
            }
        }

        //System.out.println(gap-1);
        return gap-1;
    }
}

