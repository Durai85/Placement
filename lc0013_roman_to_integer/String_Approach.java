package lc0013_roman_to_integer;

import java.util.Map;
import java.util.HashMap;

public class String_Approach {
     public int romanToInt(String s) {
        Map<Character,Integer> pair = new HashMap<>();
        pair.put('I',1);
        pair.put('V',5);
        pair.put('X',10);
        pair.put('L',50);
        pair.put('C',100);
        pair.put('D',500);
        pair.put('M',1000);

        int num = 0;
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");

        // System.out.println(s);
        
        char[] arr = s.toCharArray();
        for(char c : arr){
            num += pair.get(c);
        }

        return num;
    }
}
