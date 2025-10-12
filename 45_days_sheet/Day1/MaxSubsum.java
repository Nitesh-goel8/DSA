public class MaxSubsum{
    public static void main(String[] args) {
        //kadades ALgorithm
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(MaxSubarray(arr));
    }
     public static int MaxSubarray(int[] arr){
        

        int ans = Integer.MIN_VALUE;
        int sum =0 ; 
        
        for(int i= 0 ; i<arr.length ;i++){
            sum += arr[i];
            ans = Math.max(ans, sum);
             if (sum<0){
            sum=0  ;
        }      
        }
        return ans;


     }
}