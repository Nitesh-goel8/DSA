
public class question1 {    public static void main(String[] args) {
        int arr[] ={1,2, 3, 4 ,5, 6, 7, 8};
       int n = arr.length ;
    //    System.out.println(n);
    RotateArrays(arr ,3);
    
    for(int i = 0 ; i<arr.length ;i++){
        System.out.print(arr[i]+" ");
    }
    }

    // public static void RotateArray(int k , int arr[]){
    //   int n = arr.length ; 
    //   k = k%n ;
    // for(int j = 1 ; j<=k ; j++){
    //   int item = arr[n-1];
    //    for(int i = n-2; i>=0 ; i-- ){
    //       arr[i+1]=arr[i];
     
    //    }
    //          arr[0]=item;
    //    }
    // }

    public static void RotateArrays(int arr[], int k){
int n = arr.length ; 
       k = k%n ;
       reverseAlgo(arr,0,n-1);
       reverseAlgo(arr, 0, k-1);
       reverseAlgo(arr, k ,n-1);

    }

    public static void reverseAlgo(int arr[],int i , int j){
        
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
       
        }
    }

