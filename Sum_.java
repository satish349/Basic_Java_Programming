package Basic;

import java.util.*;

public class Sum_ {
    public static void main(String args[]) {

        Scanner rs = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = rs.nextInt();

        // find the sum of all natural number.
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum of all natural number is : " + sum);
    }
}
