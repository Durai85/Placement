package lc0058_length_of_last_word;

public class Optimal {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        char[] arr = s.toCharArray();
        int count = 0;
        int i = arr.length-1;
        while(i >=0 && arr[i--]!=' '){
            count ++;
        }
        return count;
    }
}
