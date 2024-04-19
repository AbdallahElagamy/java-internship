import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        int numToFind = in.nextInt(), position = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == numToFind && i >= 5) {
                position = i;
                break;
            }
        }
        if (position == -1)
            System.out.println("Number not Founded");
        else
            System.out.println("Number Founded in position: " + position);
    }

}
