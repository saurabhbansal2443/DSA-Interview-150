class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        String[] arr = str.split(" "); 
        return arr[arr.length-1].length(); 
    }
}
// In this question the s string is basically a sentence we just have to return the
// length of last word 
// first we have used trim to remove starting and ending extra space removing 
// then we split the string then find out the length of last word 
