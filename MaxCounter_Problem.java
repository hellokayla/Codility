
import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        // counter can only hold up to N 
        int[] counter = new int[N];
        int maxvalue = 0; 
        int position = 0;
        for (int i = 0; i < A.length; i++) {
            
            if (A[i] <= N && A[i] >=1) {
             
                // Want to increase X
                position = A[i]-1;
                counter[position]++;
                // Need a way to store the maxcounter
                if (counter[position]>maxvalue) {   
                 maxvalue = counter[position];  
                 }
                 
            }
            if (A[i] == (N+1)) {
                
               Arrays.fill(counter,maxvalue);
            }       
        }
        
        return counter; 
        
    }
}