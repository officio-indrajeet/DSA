package Arrays;

public class DeleteElement {
    public static void main(String[] args) {

        int[] arr = {3,8,12,5,6};

        int x = 12 , n = 5;

         n = deleteElementInAnArray(arr , x, n);

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println(arr[arr.length-1]);

        System.out.println(arr.length);
    }

    public static int deleteElementInAnArray(int[] arr , int x , int n) {
        int i = 0;

        for(i=0;i<n;i++) {

            if(arr[i] == x)
                break;
        }

        if(i==n)
            return n;

        for(int j =i;j<n-1;j++) {
            arr[j] = arr[j+1];
        }

        return n-1;
    }
}
