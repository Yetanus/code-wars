package cw2;

public class Kata
{
    public static void main(String[] args) {
        String kappa = new String("The quick brown fox jumps over the lazy dog.");
        System.out.println(kappa);
        System.out.println(reverseWords(kappa));
        System.out.println(reverseWords("Kappa Pride"));
    }
    public static String reverseWords(final String original)
    {
        String[] array = original.split(" ");

        if(array.length == 0)
            return original;


        int i = 0;
        for(String string : array){
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        return String.join(" ",array);
    }
}