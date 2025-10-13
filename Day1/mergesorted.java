package Day1;

import java.util.Arrays;

public class mergesorted {
     public static void main(String[] args) {
        int[] num1= {1,2,3,0,0,0};
        int[] num2 ={2,5,6};
        int m  =  num1.length ;
        int n = num2.length;

        merge(num1, m, num2, n);
     }
     public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0 ; i<m; i++){
            if(nums1[i]==0){
               nums1[i] = nums2[i-n];
            }
            
        }
        Arrays.sort(nums1);
        for(int i = 0 ; i<m ; i++){
         System.out.print(nums1[i]+" ");
        }
    }
}
