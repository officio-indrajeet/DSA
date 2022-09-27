package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {

            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int low = 0 , high = n-1;

        while(low <= high) {

            int mid = (low + high)/2; // low + (high-low)/2;
            // 1. compare the mid the element with the target element
            if(arr[mid] == target) {
                System.out.println("Target element is found at index"+mid);
                break;
            }
            else if(arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;

        }

        System.out.println("Element Not found in the array");
    }
}
