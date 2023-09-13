
package Day_1;

import java.util.Scanner;

/**
 * Q_3
 */
public class Q_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To Find its Factoriall");
        int number = sc.nextInt();
        int factorial = 1;
        // int ans = 4*3*2*1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial OF Given Number is = " + factorial);
        sc.close();
    }
}