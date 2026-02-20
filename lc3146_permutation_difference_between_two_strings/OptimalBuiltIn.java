package lc3146_permutation_difference_between_two_strings;

public class OptimalBuiltIn {
    public int findPermutationDifference(String s, String t) {
        int len = s.length();
        int count = 0;
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            count += Math.abs(i-t.indexOf(c));       
        }
        return count;
    }
}
