package lc0383_ransom_note;

public class Optimal {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        for(int i=0; i<ransomNote.length(); i++){
            arr[ransomNote.charAt(i)-'a']--;
        }
        for(int i=0; i<magazine.length(); i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i : arr){
            if(i<0) return false;
        }
        return true;
    }
}
