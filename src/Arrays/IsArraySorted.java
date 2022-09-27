package Arrays;

import java.util.Scanner;

public class IsArraySorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;

        for(int i=1;i<size;i++) {
            if(arr[i] < arr[i-1]) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
