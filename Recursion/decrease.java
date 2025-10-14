package Recursion;

public class decrease {
    public static void main(String[] args) {
        int n = 8 ;
        reduce(n);
    }
    
    public static void reduce(int n){

        if(n==0){
            return ;
        }

        System.out.println(n);
          reduce(n-1);
    }
    
}
