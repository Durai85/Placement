package lc0424_longest_repeating_character_replacement;

public class ArrayMap {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxLen=0;
        int maxFreq=0;
        int[] freq = new int[26];
        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);
            while((r-l+1) - maxFreq > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, (r-l+1));
        }
        return maxLen;
    }
}
