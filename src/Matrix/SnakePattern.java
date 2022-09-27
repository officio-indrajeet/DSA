package Matrix;

import java.util.Scanner;

public class SnakePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++) {

            if(i%2 == 0) {
                for(int j=0;j<cols;j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for(int j=cols-1;j>=0;j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
}
