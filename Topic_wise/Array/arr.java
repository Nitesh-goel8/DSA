import java.util.Scanner;

public class arr{
       public static void main(String[] args){

        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int[] arr = new int[n];
    
        int[] other = arr ; 

        for(int i = 0 ; i<arr.length;i++){
            arr[i] = Input.nextInt();
        }
        // Display(arr);
        Swap(arr , 0 , 1);
         System.out.println(arr[0]+""+arr[1]);
    }

    //    public static void Display(int[]arr){
    //     for(int i= 0 ; i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
    //    }
     
    public static void Swap(int[] arr ,int a , int b ){
        int temp = arr[a] ; 
        arr[a]= arr[b] ;
        arr[b] = temp ;
      }
}

