package cw7;

class Solution {
    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == Character.toUpperCase(input.charAt(i))) {
                sb.append(" ");
                sb.append(input.charAt(i));
            } else sb.append(input.charAt(i));
        }
        return String.valueOf(sb);
    }
}
