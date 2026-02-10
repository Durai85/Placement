package lc0500_keyboard_row;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset {
    public String[] findWords(String[] words) {
        List<String> res =  new ArrayList<>();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();
        addSet(r1,row1);
        addSet(r2,row2);
        addSet(r3,row3);
        for(String i : words){
            if(isinrow(i.toLowerCase(),row1) || isinrow(i.toLowerCase(),row2) || isinrow(i.toLowerCase(),row3)){
                res.add(i);
            }
        }

        return res.toArray(new String[0]);
    }

    private void addSet(String r, Set<Character> row){
        for(char c : r.toCharArray()){
            row.add(c);
        }
    }

    private boolean isinrow(String word, Set<Character> row){
        for(char w : word.toCharArray()){
            if(!row.contains(w)) return false;
        }
        return true;
    }
}
