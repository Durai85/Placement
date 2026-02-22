package lc0868_binary_gap;

public class Optimal {
    public int binaryGap(int n) {
        int lastPosition = -1;   // last index where we saw '1'
        int currentPosition = 0; // current bit index
        int maxGap = 0;

        while (n > 0) {

            if ((n & 1) == 1) {  // if current bit is 1
                if (lastPosition != -1) {
                    int gap = currentPosition - lastPosition;
                    maxGap = Math.max(maxGap, gap);
                }
                lastPosition = currentPosition;
            }

            n = n >> 1;          // move to next bit
            currentPosition++;
        }

        return maxGap;
    }
}
