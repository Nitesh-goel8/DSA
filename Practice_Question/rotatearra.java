package Practice_Question;

import java.util.Scanner;

public class rotatearra {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt() ;
        
        int n = arr.length ;
        RotateArrays(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }

    }

    public static void RotateArrays(int[] arr, int k) {
        int n = arr.length;
        k = k%n ;
        ReverseArrays(arr,0,n-1);
        ReverseArrays(arr, 0,k-1);
        ReverseArrays(arr , k, n-1);

    }

    public static void ReverseArrays(int arr[], int start , int end) {
     

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

    }
}
