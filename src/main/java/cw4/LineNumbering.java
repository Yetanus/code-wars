package cw4;

import java.util.*;

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
        System.out.println(number(Arrays.asList("", "", "")));
    }

    public static List<String> number(List<String> lines) {
        ArrayList<String> lineNumb = new ArrayList<>(10);
        for (int i = 0; i < lines.size(); i++) {
            StringBuilder sb = new StringBuilder();
            if (lines.get(i).equals("")) {
                sb.append(i+1);
                sb.append(": ");
            } else {
                sb.append(i + 1);
                sb.append(": ");
                sb.append(lines.get(i));
            }
            lineNumb.add(sb.toString());
        }
        return lineNumb.stream().toList();
    }
}