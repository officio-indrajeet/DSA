package BinarySearch;

import java.util.Scanner;

public class PeakElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {

            arr[i] = sc.nextInt();
        }

        int peakElement = findPeakElement(arr , n);

        System.out.println("Peak Element found at index ::"+peakElement);

        }

    private static int findPeakElement(int[] arr, int n) {
        int low = 0 , high = n-1;
        while(low <= high) {

            int mid = low +(high-low)/2;

            if(mid > 0 && mid < n-1) {

                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                        return mid;
                }
                else if(arr[mid-1] > arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else if(mid == 0) {

                if(arr[mid] > arr[mid+1])
                    return mid;
                else
                    return mid+1;
            }
            else if(mid == n-1) {
                if(arr[mid] > arr[mid-1])
                    return mid;
                else
                    return mid-1;
            }
        }
        return -1;
    }

}
