package lc0881_boats_to_save_people;

import java.util.Arrays;

public class Optimal {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int left = 0;
        int right = people.length - 1;
        while(left <= right){ 
            if(people[left] + people[right] <= limit){
                count ++;
                left ++;
                right --;
            }
            else{
                count ++;
                right --;
            }
        }
        return count;
    }
}
