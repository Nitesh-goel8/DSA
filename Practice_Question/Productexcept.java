package Practice_Question;

public class Productexcept {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        Productexceptself(arr);

    }

    public static void Productexceptself(int[]arr){
         int n = arr.length;
         int [] left = new int[n];
         left[0] =1 ;
        for(int i = 1; i<n;i++){
            left[i] = arr[i-1]*left[i-1];
            // System.out.println(left[i]);
        }
        int[] right = new int[n];
        right[n-1] = 1;
        for(int i = n-2 ;i>= 0 ;i--){
            right[i] =right[i+1]*arr[i+1];
            // System.out.println(right[i]);
        }
   
        // int ans = 0 ; 
        for(int i =0 ; i<n ;i++){
            left[i]= right[i]*left[i];
            System.out.print(left[i]+" ");
        }
    }
}
