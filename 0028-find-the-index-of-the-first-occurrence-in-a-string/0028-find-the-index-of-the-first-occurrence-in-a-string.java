class Solution {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        return haystack.indexOf(needle);

    }
    // in this question basically we have to see that the does the needle string 
    // is present in haystack if present just return the first index 
}
