package cw4;

import java.util.ArrayList;
//TODO finish - loop fails
public class StringSplit {
    public static void main(String[] args) {
        String[] testArray = new String[10];
        testArray = solution("abcdfedfghdfhg");
        for (String element:testArray)
        {
            System.out.println(element);
        }
    }
    public static String[] solution(String s) {
        int begCounter = 0;
        int endCounter = 2;
        System.out.println(s.length());
        ArrayList<String> subList = new ArrayList<>();
        String[] subArray = {"__"};
        if(s.length()==0)
        {
            subArray = new String[]{"__"};
            return subArray;
        }
        do
       {
           subList.add(s.substring(begCounter,endCounter));
           begCounter+=2;
           endCounter+=2;
       }
        while (s.length()<=endCounter);
        subArray = subList.toArray(new String[10]);
        return subArray;
    }
}
