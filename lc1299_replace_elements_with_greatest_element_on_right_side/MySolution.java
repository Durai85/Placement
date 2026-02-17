package lc1299_replace_elements_with_greatest_element_on_right_side;

public class MySolution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int max = 0;
        for(int i=arr.length-1; i>=0; i--){
            result[i] = max;
            max = Math.max(max,arr[i]);
        }
        if(arr.length>1){
            result[arr.length-2] = arr[arr.length-1];
        }
        result[arr.length-1] = -1;
        return result;
    }
}
