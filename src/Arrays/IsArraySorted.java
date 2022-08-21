package Arrays;

import java.util.Scanner;

public class IsArraySorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;

        for(int i=1;i<n;i++) {

            if(arr[i-1] > arr[i]) {
                flag = false;
                System.out.println("Array is not sorted");
                return;
            }
        }

        if(flag)
             System.out.println("Array is sorted");

        sc.close();
    }
}
