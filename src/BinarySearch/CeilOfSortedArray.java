package BinarySearch;

import java.util.Scanner;

public class CeilOfSortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {

            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int res = 0;

        int low = 0 , high = n-1;

        boolean flag = false;

        while(low <= high) {

            int mid = low + (high-low)/2;

            if(arr[mid] == target) {
                System.out.println("Ceil of sorted array :: "+arr[mid]);
                flag = true;
                break;
            }
            else if(arr[mid] > target) {
                res = arr[mid];
                high = mid - 1;
            }
            else {
                low = mid+1;
            }

        }

        if(flag == false)
            System.out.println("Ceil of sorted array :: "+res);


    }
}
