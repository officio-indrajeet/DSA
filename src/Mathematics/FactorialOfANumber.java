package Mathematics;

import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 1;
        for(int i = 2;i<=n;i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
