package inputmismatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionTask {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2, sum;
        num1 = takeInput(1);
        num2 = takeInput(2);
        sum = num1 + num2;
        System.out.println("Summation: " + sum);
    }

    public static int takeInput(int cnt) {
        int tmp;
        do {
            try {
                System.out.printf("Enter Number %d: ", cnt);
                tmp = in.nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Input a valid number");
                in.next();
            }
        } while (true);

        return tmp;
    }

}