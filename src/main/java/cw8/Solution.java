package cw8;

public class Solution {
    public static void main(String[] args) {
        System.out.println(factorialLoop(0));
        System.out.println(zeros(0));
    }
    public static long factorialLoop(int n) {
        long fact = 1;
        if (n == 0 ) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }
    public static int zeros(int n) {
        int zerosCounter = 0;
        String factorialString = Long.toString(factorialLoop(n));
        for (int i = factorialString.length() - 1; i >= 0; i--) {
            //System.out.print(factorialString.charAt(i));
            if(factorialString.charAt(i) == '0'&&factorialString.length()!=1)
            {
                zerosCounter++;
            }
            else break;
        }
        return zerosCounter;
    }


}