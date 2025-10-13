package Day1;

public class max_circular_subarray {
    public static void main(String[] args) {
        int [] arr ={1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(arr));
    }

     public static int maxSubarraySumCircular(int[] arr) {
        int linearsum = Kadaens_algo(arr);
       int  minimum_sum = 0 ;
       int  total_sum = 0 ;
       

       for(int i = 0 ; i<arr.length ;i++){
           total_sum += arr[i] ;
           arr[i] = arr[i]* -1 ;
       }
       int circularSum = Kadaens_algo(arr) + total_sum ;
        return Math.max(linearsum, circularSum);
    }

    public static int Kadaens_algo(int[]arr){
        int sum = 0 ;
        int ans = Integer.MIN_VALUE ;

        for(int i =0 ; i<arr.length ;i++){
           sum += arr[i] ;
           ans = Math.max(ans, sum);
             if(sum < 0){
                sum = 0 ; 
             }
            
        }
        return ans ;
    } 
}
