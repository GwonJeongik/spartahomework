package packofcards;

import java.util.Scanner;

public class PackOfCards {

    public static void main(String[] args) {
        String[] foodReview = new String[10];

        Scanner scanner = new Scanner(System.in);

        String foodName = scanner.nextLine();
        double tasteScore = scanner.nextDouble();
        scanner.nextLine(); // 줄먹기

        for (int i = 0; i < 10; i++) {
            foodReview[i] = scanner.nextLine();
        }

        System.out.println("[" + foodName + "]");
        System.out.println("별점: " + tasteScore + " " + (int) (tasteScore / 5 * 100) + "%");

        for (int i = 0; i < foodReview.length; i++) {
            if ((foodReview.length - 1) != i) {
                System.out.println((i + 1) + "." + foodReview[i]);
            } else {
                System.out.print((i + 1) + "." + foodReview[i]);
            }
        }
    }
}
