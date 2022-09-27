package Arrays;

import java.util.Scanner;

public class SlidingWindow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int curr_sum = 0;
        for(int i=0;i<k;i++) {
            curr_sum += arr[i];
        }
        int max_sum = curr_sum;

        for(int i=k;i<n;i++) {

            curr_sum += (arr[i] - arr[i-k]);
            max_sum = Math.max(max_sum , curr_sum);
        }

        System.out.println(max_sum);

    }
}
