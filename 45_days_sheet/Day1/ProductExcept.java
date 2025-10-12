public class ProductExcept {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6};
        int[] result = ProductExceptSelf(nums);
        for(int x : result){
            System.out.print(x + " ");
        }
    }

    public static int[] ProductExceptSelf(int[] nums){
        int n = nums.length;

        int[] left = new int[n];
        left[0] = 1;
        for(int i = 1; i < n; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        int[] right = new int[n];
        right[n-1] = 1;
        for(int j = n-2; j >= 0; j--){
            right[j] = right[j+1] * nums[j+1];
        }

        for(int i = 0; i < n; i++){
            left[i] = left[i] * right[i];
        }

        return left;
    }
}
