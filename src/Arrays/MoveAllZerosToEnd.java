package Arrays;

import java.util.Scanner;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i=0;i<size;i++) {

            if(arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();



    }
}
