package sapient.questions;

import java.util.SortedMap;

public class ATOI_StringToNumber {
    public static void main(String[] args) {
        String str = "123";
        int num  =stringToNumber( str);
        System.out.println(" String to number is "+ num);
    }
    //if -123 is there, sstart the index with 1 and then multiply the ans with -1.

    private static int stringToNumber(String str) {
        int num=0;
        for(int i=0; i<str.length();i++){
            int digit = (int) str.charAt(i)-48;
            num=num*10+digit;
        }
        return num;
    }
}
