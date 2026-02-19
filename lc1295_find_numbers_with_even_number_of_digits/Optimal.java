package lc1295_find_numbers_with_even_number_of_digits;

public class Optimal {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if(evenDigit(num)) count++;
        }
        return count;
    }
    private boolean evenDigit(int num){
        return (int)(Math.log10(num)+1) % 2 == 0;
    }
}
