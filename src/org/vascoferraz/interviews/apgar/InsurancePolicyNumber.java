package org.vascoferraz.interviews.apgar;

public class InsurancePolicyNumber {

    public static void main(String[] args) {
        System.out.println(changeFormat("Please quote your policy number: 112-39-8552."));
    }

    public static String changeFormat(String paragraph) {

        paragraph = paragraph.replace("-", "/");

        String part0 = paragraph.substring(0, 33);
        String part1 = paragraph.substring(33, 36);
        String part2 = paragraph.substring(37, 39);
        String part3 = paragraph.substring(40, 44);
        String part4 = paragraph.substring(44, 45);

        System.out.println(part0);
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);
        System.out.println(part4);

        paragraph = part0 + part1 + "/" + part3 + "/" + part2 + part4;

        return paragraph;

    }

}
