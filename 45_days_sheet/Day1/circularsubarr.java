public class circularsubarr {
    public static void main(String[] args) {
       int[]arr = {5,0,5}; 
    }

    public static int Circularsubarray(int[] arr){
         int total = 0;
        int maxSum = Integer.MIN_VALUE, sum = 0;
        int minSum = Integer.MAX_VALUE, minSumNow = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) sum = 0;

            minSumNow += arr[i];
            minSum = Math.min(minSum, minSumNow);
            if (minSumNow > 0) minSumNow = 0;

            total += arr[i];
        }

        if (maxSum < 0) return maxSum;
        return Math.max(maxSum, total - minSum);
    }
    }
