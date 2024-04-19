import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
    }

    public double avg(int[] arr) {
        double sum = summation(arr);
        return sum / arr.length;
    }

    public int summation(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
