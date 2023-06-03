
// 6.Write a program to input 3-digitnumber and find out whether the number is an Armstrong number or not.
import java.util.Scanner;

public class Armstrong_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int number = scanner.nextInt();
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        scanner.close();
    }

}
