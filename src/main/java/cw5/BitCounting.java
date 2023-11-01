package cw5;

public class BitCounting {
    public static void main(String[] args) {
        for (int i = 0; i < 129; i++) {
            System.out.println("current value is: " +i+ " with binary "+Integer.toBinaryString(i)+" with ones "+countBits(i));

        }
    }

    public static int countBits(int n)
    {
        char one ='1';
        int counter=0;
        if(n<0) return 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++)
        {
                if(binary.charAt(i) == one)
                {
                    counter++;
                }
        }
        return counter;
    }

}