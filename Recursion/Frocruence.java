package Recursion ;
public class Frocruence{
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9,0};
        int item = 79 ; 
        System.out.println(Index(arr , item ,0));
    }

    public static int Index(int[]arr , int item , int idx){
        if(idx == arr.length){
            return -1 ;
        }
        if(arr[idx]== item){
            return idx ;
        }

       return Index(arr, item, idx+1);
    }
}
