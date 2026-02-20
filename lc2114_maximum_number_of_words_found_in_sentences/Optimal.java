package lc2114_maximum_number_of_words_found_in_sentences;

public class Optimal {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences){
            String temp[] = s.split(" ");
            max = Math.max(max, temp.length);
        }
        return max;
    }
}
