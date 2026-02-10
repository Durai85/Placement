package lc0205_isomorphic_strings;

public class Optimal_Array {
    public boolean isIsomorphic(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2) return false;
        
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        for(int i=0; i<len1; i++){
            if(arr1[s.charAt(i)] != arr2[t.charAt(i)]) return false;
            arr1[s.charAt(i)] = i+1;
            arr2[t.charAt(i)] = i+1;
            // System.out.println(Arrays.toString(arr1));
        }

        return true;
    }
}
