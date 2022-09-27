package BinarySearch;

import java.util.Scanner;

public class FirstOccurencesAndLastOccurences {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {

            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int low = 0 , high = n-1;

        // first occurences :

        while(low <= high) {

            int mid = (low + high)/2;

            if(arr[mid] > target) {
                high = mid - 1;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {

                if(mid == 0 || arr[mid-1] != arr[mid]) {
                    System.out.println("first occurences of elemnet found at index :: "+mid);
                    break;
                }
                else {
                    high = mid - 1;
                }

            }
        }

        // last occurences

        while(low <= high) {

            int mid = (low + high)/2;

            if(arr[mid] > target) {
                high = mid - 1;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {

                if(mid == n-1 || arr[mid+1] != arr[mid]) {
                    System.out.println("last occurences of elemnet found at index :: "+mid);
                    break;
                }
                else {
                    low = mid + 1;
                }

            }
        }
    }
}
