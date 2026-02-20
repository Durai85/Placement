package lc0058_length_of_last_word;

import java.util.Arrays;

public class Builtin {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-1].length();
    }
}
