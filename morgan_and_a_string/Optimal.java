package morgan_and_a_string;

public class Optimal {
    public static String morganAndString(String a, String b) {
    // Write your code here
        a += "{";
        b += "{";
        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();
        while(i < a.length()-1 && j < b.length()-1){
            if(a.charAt(i) < b.charAt(j)){
                result.append(a.charAt(i++));
            }
            else if(a.charAt(i) > b.charAt(j)){
                result.append(b.charAt(j++));
            }
            else{
                int x = i;
                int y = j;
                int c = a.charAt(i);
                while(x < a.length()-1 && y < b.length()-1 && a.charAt(x)==b.charAt(y)){
                    x++;
                    y++;
                }
                if(a.charAt(x) <= b.charAt(y)){
                    while((i<a.length()-1) && a.charAt(i)==c){
                        result.append(a.charAt(i++));
                    }
                }
                else{
                    while((j<b.length()-1) && b.charAt(j)==c){
                        result.append(b.charAt(j++));
                    }
                }
            }
        }
        while(i < a.length()-1){
            result.append(a.charAt(i++));
        }
        while(j < b.length()-1){
            result.append(b.charAt(j++));
        }
        return new String(result);
    }
}
