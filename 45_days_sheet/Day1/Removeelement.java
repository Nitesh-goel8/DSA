public class Removeelement {
    public static void main(String[] args) {
        int[] spells ={5,1,3};
        int[] potions ={1,2,3,4,5};
        long success =7;
        
       System.out.println(successfulPairs(spells , potions , success));
    }
      public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int count = 0;
        int [] arr = new int[spells.length];
        for(int i = 0 ;i< spells.length ;i++){
            for(int j= 0 ;j<potions.length ;j++ ){
                 
                if( spells[i]*potions[j] >= success){
                    count++;
                }
 
            }
            arr[i]=count;
        
            // System.out.print((count)+" ");
            count = 0;
        }
        return arr ;
    }
}