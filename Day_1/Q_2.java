package Day_1;

import java.util.Scanner;

public class Q_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input Where to Find the Sum of Even And Odd Numbers");
        int number = sc.nextInt();
        int sumOfEvenNUmbers = 0, sumOfOddNUmbers = 0;

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                sumOfEvenNUmbers = sumOfEvenNUmbers + i;
            } else {
                sumOfOddNUmbers = sumOfOddNUmbers + i;
            }

        }
        System.out.println("Some of Even Numbers = " + sumOfEvenNUmbers);
        System.out.println("Some of Odd Numbers = " + sumOfOddNUmbers);
        sc.close();
    }
}
