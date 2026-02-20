package lc2351_first_letter_to_appear_twice;

public class Optimal {
    public char repeatedCharacter(String s) {
        int arr[] = new int[26];
        for(char c : s.toCharArray()){
            arr[ c - 'a'] += 1;
            if(arr[ c - 'a'] > 1){
                return c;
            }
        }
        return ' ';
    }
}