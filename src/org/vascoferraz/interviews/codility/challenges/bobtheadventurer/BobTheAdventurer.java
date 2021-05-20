package org.vascoferraz.interviews.codility.challenges.bobtheadventurer;

import java.util.HashSet;
import java.util.Set;

public class BobTheAdventurer {

    public static void main(String[] args) {

        Point2D[] point2D = new Point2D[5];

        // statue 0
        point2D[0] = new Point2D();
        point2D[0].x = -1;
        point2D[0].y = -2;

        // statue 1
        point2D[1] = new Point2D();
        point2D[1].x = 1;
        point2D[1].y = 2;

        // statue 2
        point2D[2] = new Point2D();
        point2D[2].x = 2;
        point2D[2].y = 4;

        // statue 3
        point2D[3] = new Point2D();
        point2D[3].x = -3;
        point2D[3].y = 2;

        // statue 4
        point2D[4] = new Point2D();
        point2D[4].x = 2;
        point2D[4].y = -2;

        System.out.println("Number of lasers: " + solution(point2D));
    }


    public static int solution(Point2D[] A) {

        Set<Float> setYpositive = new HashSet();
        Set<Float> setYnegative = new HashSet();

        for (int i = 0; i < A.length; i++) {

                if (A[i].y > 0) {
                    setYpositive.add( ((float)A[i].x / (float)A[i].y) );
                }

                if (A[i].y < 0) {
                    setYnegative.add( ((float)A[i].x / (float)A[i].y) );
                }
            }

        return setYpositive.size()+setYnegative.size();
    }
}
