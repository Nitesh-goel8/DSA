package Recursion;

public class power {
    public static void main(String[] args) {
        int n = 5 ;
        int k = 3 ;
        System.out.println(powerof(n, k));
    }
    public static int powerof(int n , int k){

        if(k==0){ 
            
            return 1 ;
        }

        int ll = powerof(n, k-1);

          return ll*n ;
    }
}
