package Arrays;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = arr[0];
        for(int i=1;i<n;i++) {
            lmax[i] = Math.max(lmax[i-1],arr[i]);
        }

        rmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--) {
            rmax[i] = Math.max(rmax[i+1],arr[i]);
        }

        int result = 0;

        for(int i=0;i<n;i++) {
            result += Math.min(lmax[i],rmax[i]) - arr[i];
        }

        System.out.println(result);

    }
}
