package lc1356_sort_integers_by_the_number_of_1_bits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BucketSort {
    public int[] sortByBits(int[] arr) {
        Map<Integer,List<Integer>> map = new TreeMap<>();
        for(int a : arr){
            int count = countOnes(a);
            if(!map.containsKey(count)){
                map.put(count, new ArrayList<>());
                map.get(count).add(a);
            }
            else{
                map.get(count).add(a);
            }
        }
        for(List<Integer> list : map.values()){
            Collections.sort(list);
        }

        int[] result = new int[arr.length];
        int j = 0;
        for(int key : map.keySet()){
            for(int i=0; i<map.get(key).size() && j<arr.length; i++){
                result[j++] = map.get(key).get(i);
            }
        }
        return result;
    }

    private int countOnes(int num){
        int count = 0;
        while(num > 0){
            num = num & (num-1);
            count ++;
        }
        return count;
    }
}
