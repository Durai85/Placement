package lc1823_find_the_winner_of_the_circular_game;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) list.add(i);

        int idx = 0;
        while(list.size() > 1){
            idx = (idx + k - 1) % list.size();
            list.remove(idx);
        }
        return list.get(0);
    }
}
