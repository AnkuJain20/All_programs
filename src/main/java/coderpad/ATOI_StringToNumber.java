package coderpad;

import java.util.SortedMap;

public class ATOI_StringToNumber {
    public static void main(String[] args) {
        String str = "123";
      int num  =stringToNumber( str);
        System.out.println(" String to number is "+ num);
    }

    private static int stringToNumber(String str) {
        int num=0;
        for(int i=0; i<str.length();i++){
            int digit = (int) str.charAt(i)-48;
            num=num*10+digit;
        }
        return num;
    }
}
