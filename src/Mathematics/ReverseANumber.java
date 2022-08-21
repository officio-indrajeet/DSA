package Mathematics;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // cin >> n;

        int reverse = 0;

        while(num != 0) {

            int temp = num %10;

            reverse = reverse * 10 + temp;

            num = num/10;
        }

        System.out.println(reverse);


    }
}
