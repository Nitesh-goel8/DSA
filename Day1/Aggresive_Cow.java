
package Day1 ;
import java.util.Scanner;

public class Aggresive_Cow{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int n = sc.nextInt();
        int c =sc.nextInt();
        int[] stall = new int[n] ;

        for(int i = 0 ;i<n ;i++){
            stall[i] = sc.nextInt();
            System.out.print(stall[i]+" ")
            ;
        }
        Placementofstall(stall, c);
        

    }
    public static int Placementofstall(int[] stall , int c){
        int lo = 0 ;
        int hi = (stall.length -1) -stall[0];
        int ans = 0 ; 

        while(lo<= hi){
            int mid = lo + ( hi - lo)/ 2 ;

            if(isitpossibletoplace(c, stall,mid )==true ){
                ans = mid ;
                lo = mid-1 ;
                
            }
            else{
                hi = mid + 1 ;
            }
        }
        return ans ;
    }
    public static boolean isitpossibletoplace(int c , int[] stall ,int mid){
        int cow = 1;
        int pos = stall[0];

for(int i =0 ; i<stall.length ; i++){
        if( stall[i]- pos>= mid){
            cow++ ;
            pos =stall[i];
        }

        if (cow == c ){
            return true ;
        }

    }
    
    return false ;
    }

}