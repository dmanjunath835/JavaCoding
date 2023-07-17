package CodingPacakge;

import java.util.Scanner;

public class Program_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            int number = 2 * i - 1;
            System.out.print(number);
            if (i < a) {
                System.out.print(", ");
            }
        }
	}
}
