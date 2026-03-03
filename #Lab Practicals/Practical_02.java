import java.util.Arrays;
import java.util.Scanner;

public class Practical_02 {

    public static void rearrange(int[] arr) {
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] % 2 != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original: " + Arrays.toString(arr));

        rearrange(arr);

        System.out.println("Rearranged: " + Arrays.toString(arr));

        sc.close();
    }
}