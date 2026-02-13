package lc1700_number_of_students_unable_to_eat_lunch;

class Optimal{
    public int countStudents(int[] students, int[] sandwiches) {
        int one = 0;
        int zero = 0;
        for(int i : students){
            if (i==1) one ++;
            else zero ++;
        }

        for (int i : sandwiches){
            if(i==0)
                if (zero==0)
                    break;
                else 
                    zero--;
            else
                if (one==0)
                    break;
                else 
                    one--;
            }
        return one + zero;
    }
}