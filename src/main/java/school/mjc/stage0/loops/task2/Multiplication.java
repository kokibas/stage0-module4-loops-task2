package school.mjc.stage0.loops.task2;

import java.util.Scanner;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        if (multiplyByAndToInclusive < 0) {
            while (multiplyByAndToInclusive >= i) {
                multiplyByAndToInclusive = multiplyByAndToInclusive * i;
                i++; System.out.println(multiplyByAndToInclusive);
            }

        } else if (multiplyByAndToInclusive >= 0) {
            while (multiplyByAndToInclusive >= i) {
                multiplyByAndToInclusive = multiplyByAndToInclusive * i;
                i++; System.out.println(multiplyByAndToInclusive);
            }


        }
    }
}
