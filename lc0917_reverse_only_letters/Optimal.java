package lc0917_reverse_only_letters;

public class Optimal {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;
        char arr[] = s.toCharArray();
        while(left < right){

            while(left < n && !Character.isLetter(s.charAt(left))) left++;
            while(right > 0 && !Character.isLetter(s.charAt(right))) right--;

            if(left < right && Character.isLetter(s.charAt(left)) && Character.isLetter(s.charAt(right))){
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        return new String(arr);
    }
}
