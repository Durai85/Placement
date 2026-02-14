package lc0389_find_the_difference;

public class ArrayMethod {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        char[] tArr = t.toCharArray();
        for(char ch : tArr){
            arr[ch - 'a'] ++;
        }
        char[] sArr = s.toCharArray();
        for(char ch : sArr){
            arr[ch - 'a'] --;
        }

        for(int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                return (char)('a'+i);
            }
        }
        return ' ';
    }
}
