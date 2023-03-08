package cw3;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify(""));
        System.out.println(maskify("1"));
        System.out.println(maskify("12"));
        System.out.println(maskify("123"));
        System.out.println(maskify("123e"));
        System.out.println(maskify("123edgassg"));
        System.out.println(maskify("Skippy"));
        System.out.println(maskify("12345"));
    }
    public static String maskify(String str) {
        StringBuilder replStr = new StringBuilder();
        if(str.length()<=4){
            return str;
        } else{
            for (int i = 0; i < str.length()-4; i++) {
                replStr.append('#');
            }
            replStr.append(str.charAt(str.length()-4));
            replStr.append(str.charAt(str.length()-3));
            replStr.append(str.charAt(str.length()-2));
            replStr.append(str.charAt(str.length()-1));
        }
        return replStr.toString();
    }
}