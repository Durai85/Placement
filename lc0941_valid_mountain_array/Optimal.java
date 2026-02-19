package lc0941_valid_mountain_array;

public class Optimal {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        if(arr[1] < arr[0]) return false;
        int i = 0;
        while (i < arr.length-1 && arr[i] < arr[i+1]) i++;
        if (i < arr.length-1 && arr[i]==arr[i+1]) return false;
        boolean flag = false;
        while (i < arr.length-1 && arr[i+1] < arr[i]){ 
            i++;
            flag = true;
        }
        if (i < arr.length-1 && arr[i] <= arr[i+1]) return false;
        return flag;
    }
}
