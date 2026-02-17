package lc1299_replace_elements_with_greatest_element_on_right_side;

public class LittleBetterSolution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int max = -1;

        for(int i = arr.length - 1; i >= 0; i--) {
            result[i] = max;
            max = Math.max(max, arr[i]);
        }

        return result;
    }
}
