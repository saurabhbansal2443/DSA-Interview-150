class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1 ) return strs[0]; 
        Arrays.sort(strs); 

        String first = strs[0]; 
        String second = strs[strs.length-1]; 

        int p1 = 0 ; 
        int p2 = 0 ; 

        StringBuilder sb = new StringBuilder(""); 

        while(p1<first.length() && p2<second.length()){

            if(first.charAt(p1) == second.charAt(p2)){
                sb.append(first.charAt(p1)); 
                p1++; 
                p2++;
            }else{
                return sb.toString(); 
            }
        }

        return sb.toString(); 
    }

    // in this question we have sorted the array so that the diffrent string comes at the first and
    // last position then we have started iterating form the first and last string of array
    //then started to see  the common character between them and stored them and finally return 
}
