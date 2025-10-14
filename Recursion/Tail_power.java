package Recursion;

public class Tail_power {
    public static void main(String[] args) {
        int n = 4 ;
        int power = 3 ;
        int ans = n ;
        System.out.println(powerfun(ans ,n ,power));
    }
public static int powerfun(int ans ,int n , int power ){
  
  if(power ==0 ){
    return ans ;
  }
  
  return(powerfun( n  ,ans*n, power-1));
}
}
