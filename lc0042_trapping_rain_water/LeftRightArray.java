package lc0042_trapping_rain_water;

public class LeftRightArray {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int water = 0;

        left[0] = height[0];
        right[height.length-1] = height[height.length-1];

        // Check left tallest
        for(int i=1; i<left.length; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        for(int i=right.length-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }

        for(int i=0; i<height.length; i++){
            water += (Math.min(left[i],right[i]) - height[i]);
        }

        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        return water;  
    }
}
