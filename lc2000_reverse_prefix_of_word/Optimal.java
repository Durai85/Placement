package lc2000_reverse_prefix_of_word;

public class Optimal {
    public String reversePrefix(String word, char ch) {
        char[] result = word.toCharArray();
        int idx = -1;
        for(int i=0; i<result.length; i++){
            if (word.charAt(i)==ch){
                idx = i;
                break;
            }
        }

        if(idx == -1) return new String(result);

        int left = 0;
        int right = idx;
        while(left < right){
            char temp = result[left];
            result[left++] = result[right];
            result[right--] = temp;
        }
        return new String(result);
    }
}
