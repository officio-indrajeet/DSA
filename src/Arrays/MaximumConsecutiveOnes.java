package Arrays;

import java.util.Scanner;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int curr = 0 , res = 0;

        for(int i=0;i<arr.length;i++) {

            if(arr[i] != 1)
                curr = 0;
            else {
                curr++;
                res = Math.max(res , curr);
            }
        }

        System.out.println(res);


    }
}
