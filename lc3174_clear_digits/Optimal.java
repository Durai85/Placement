package lc3174_clear_digits;

public class Optimal {
    public String clearDigits(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(top!=-1 && Character.isDigit(c)){
                top--;
            }
            else {
                stack[++top] = c;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<=top; i++){
            result.append(stack[i]);
        }
        return result.toString();
    }
}
