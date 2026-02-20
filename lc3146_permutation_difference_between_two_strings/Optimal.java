package lc3146_permutation_difference_between_two_strings;

public class Optimal {
    public int findPermutationDifference(String s, String t) {
        int arr[] = new int[26];
        int n = s.length();
        for(int i=0; i<n; i++){
            arr[s.charAt(i) - 'a' ] = i;
        }
        for(int i=0; i<n; i++){
            arr[t.charAt(i) - 'a'] = Math.abs(arr[t.charAt(i) - 'a'] - i);
        }
        int sum = 0;
        for(int i : arr) sum += i;
        return sum;
    }
}
