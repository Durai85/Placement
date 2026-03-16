package lc0071_simplify_path;

import java.util.ArrayDeque;
import java.util.Deque;

public class Optimal {
    public String simplifyPath(String path) {
        String[] processed = path.split("/");
        StringBuilder result = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();
        for(String str : processed){
            if(!str.equals("") && !str.equals("..") && !str.equals(".")){
                stack.push(str);
            }
            else if(!stack.isEmpty() && str.equals("..")){
                stack.pop();
            }
        }
        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
            result.insert(0,"/");
        }
        return new String(result);
    }
}
