package lc0162_find_peek_element;

public class Optimal {
    public int findPeakElement(int[] nums) {
        int[] stack = new int[nums.length];
        int top = -1;
        for(int i=0; i<nums.length; i++){
            if(top != -1 && nums[stack[top]] > nums[i]){
                return stack[top];
            }
            stack[++top] = i;
        }
        return nums.length-1;
    }
}
