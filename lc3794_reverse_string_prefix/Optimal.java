package lc3794_reverse_string_prefix;

public class Optimal {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        reverse(arr,k);
        return new String(arr);
    }

    private void reverse(char[] arr, int k){
        int left = 0;
        int right = k-1;
        while(left < right){
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp; 
        }
    }
}
