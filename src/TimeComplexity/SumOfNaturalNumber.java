package TimeComplexity;

import java.util.Scanner;

public class SumOfNaturalNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(func1(n));
        System.out.println(func2(n));
        System.out.println(func3(n));
    }

    public static int func1(int n) {
        return (n*(n+1)/2);
    }

    public static int func2(int n) {
        int sum = 0;

        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static int func3(int n) {
        int sum = 0;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                sum++;
            }
        }

        return sum;
    }
}
