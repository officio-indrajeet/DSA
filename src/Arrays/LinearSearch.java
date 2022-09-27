package Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        boolean flag = false;

        for(int i=0;i<size;i++) {

            if(arr[i] == target) {
                flag = true;
                System.out.println(true);
                break;
            }

        }

        if(flag == false)
            System.out.println(false);
    }
}
