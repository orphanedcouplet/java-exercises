package class_exercises.class2;

import java.util.ArrayList;
import java.util.Scanner;

public class SumEvens {
    public static void main(String[] args) {
//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        int newInt = 0;
//
//        System.out.println("Enter an integer (or ENTER to finish)");
//

        int[] intArray = {20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : intArray) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
