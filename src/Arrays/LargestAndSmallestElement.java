package Arrays;

import java.util.Scanner;

public class LargestAndSmallestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<size;i++) {
            max = Math.max(max , arr[i]);
            min = Math.min(min , arr[i]);
        }

        int[] result = new int[2];
        result[0] = max;
        result[1] = min;

        for(int i=0;i<result.length;i++) {

            System.out.print(result[i]+" ");
        }

        System.out.println();

    }
}
