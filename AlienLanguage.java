public class Solution {
    public int solve(String[] A, String B) {
        int[] ranks=new int[26];
        for(int i=0;i<26;i++){
            ranks[B.charAt(i)-'a']=i;
        } 
        for(int i=1;i<A.length;i++){
            String previous=A[i-1];
            String current=A[i];
            if(!isSorted(previous,current,ranks)){
                 return 0;
            }  
        }
        return 1;
    }

    private boolean isSorted(String s1, String s2, int[] ranks){
        int l1 = s1.length();
        int l2 = s2.length();
        
        for(int j=0; j<Math.min(l1, l2); j++) {
            if(ranks[s1.charAt(j)-'a'] > ranks[s2.charAt(j)-'a']) {
                return false;
            } 
            else if(ranks[s1.charAt(j)-'a'] < ranks[s2.charAt(j)-'a']) {
                return true;
            }
        }
        return l1<=l2;
    }
}
