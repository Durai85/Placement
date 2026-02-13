package lc0011_container_with_most_water;

public class Optimal {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = w * h;
            max = Math.max(area, max);
            if (height[left] < height[right]){
                left++;
            } 
            else {
                right--;
            }
        }
        return max;
    }
}
