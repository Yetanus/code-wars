package cw1;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int number) {
        Integer sum =0;
        if(number<0){
            sum= 0;
        }
        else{
            Set<Integer> numbers = new HashSet<>();
            for (int i = 0; i < number; i++) {
                if (i%3==0||i%5==0) numbers.add(i);
            }
             sum = numbers.stream()
                    .reduce(0, Integer::sum);
        }
        return sum;
    }
}