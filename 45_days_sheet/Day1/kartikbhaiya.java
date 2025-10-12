public class kartikbhaiya {
    public static void main(String[] args) {
        String s = "aaababaaabbaaaabbbbabaaa";
        int k = 3 ;
        char ch = 'a' ;
       int flipa  = noofflips(s, k , 'a');
       int flipb = noofflips(s , k , 'b');
       System.out.println(Math.max(flipa,flipb));
    }

    public static int noofflips(String s , int k, char ch ){
        int ei = 0 ;
        int si = 0 ; 
        int ans = 0 ;
        int flip = 0 ;

        while(ei<s.length()){
          //grow 
          if(s.charAt(ei)==ch){
            flip++;

          }
          while(flip>k){
          if(s.charAt(si)==ch){
            flip--;
           
          }
 si++ ;
          }
          ans = Math.max(ans , (ei-si+1));
          ei++;
        }
        return ans ;
    }
}
