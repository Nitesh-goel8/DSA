public class AWE{
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,0,1,2,3};
    }

    public static int SearchRotateArray(int[] arr , int target){
       int start = 0 ;
       int end = arr.length-1;

      while(start<= end){
           int middleelement = start + end /2 ;
           
           if(arr[middleelement]== target){
            return middleelement ;
           }

           if(arr[middleelement]> target){
            if(target>arr[start]&& target<arr[middleelement]){
             end = middleelement -1 ;
            }
            else(
            start = middleelement + 1 ;
            )
           }
      }

        return -1 ;
    }
}
