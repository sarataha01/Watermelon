package testing;

import java.util.Scanner;

public class lab {
    public static int weight;
    public static void main(String[] args)
    {
        checker(weight);
    }

    public static int checker(float weight) {
        /*System.out.println("Enter weight ranging from 1 to 100: ");
        Scanner input = new Scanner(System.in);
        weight = input.nextInt();*/

        if (weight >= 1 && weight <= 100) {
            if ((weight % 2) == 0) {
                System.out.println("YES");
                return 1;
            } else {
                System.out.println("NO");
                return -1;
            }
        } else {
            System.out.println("out of range");
            return 0;
        }
    }
}

