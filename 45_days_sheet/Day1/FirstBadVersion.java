public class FirstBadVersion {
    public static void main(String[] args) {
        
    }

    public boolean FirstBadVersion(int n){
        
        long lo = 1 ;
        long hi = n;
        
        long ans = 0 ;

        while(lo<=hi){
            long mid = (lo+hi)/2 ;
            if(isBadVersion(mid)){
                ans = mid ;
                hi=mid-1 ;
            }
            else{
                lo =mid +1 ;
            }
        }


        
        
        
        return false ;
    }

    private boolean isBadVersion(long mid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isBadVersion'");
    }
}
