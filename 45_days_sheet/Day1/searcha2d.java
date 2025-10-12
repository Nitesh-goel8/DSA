public class searcha2d{
 public static void main(String[] args) {
    int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target = 9 ;

 }

 public static boolean SearchIn2D(int[][]arr , int target){
    int row = 0 ;
    int column = arr[0].length -1;

    while(row<arr.length && column>= 0){
  if (arr[row][column] == target){
    return true;
  }
  else if (arr[row][column]> target){
    column--;
  }
  else {
    row--;
  }
    }
        
    return false ;
 }
}