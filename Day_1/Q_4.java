package Day_1;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number To Find Table ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = i * number;
            System.out.println(number + " x " + i + " = " + table);
        }
        sc.close();
    }
}
