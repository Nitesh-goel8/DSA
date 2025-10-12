public class productlessthan_k{
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,6,7,8,8};
        int k = 10 ;
        System.err.println(SUbarrayless(arr, k));
    }
    public static int SUbarrayless(int[] arr , int k){
        int si = 0 ;
        int ei = 0 ;
        int product = 1;
        int ans = 0 ;

        // for (int i =0 ; i<arr.length ; i++){
        while(ei<arr.length){
            //growing
            product = product *arr[ei] ;
            //shrinking
            while (product>=k && si<=ei) {
                product = product/arr[si];
                si++;
            //answer
            }
        ans = ans+ (ei-si+1);
        ei++;

        }
        return ans ;

    }
}
