package sapient.questions;

import java.sql.SQLOutput;
import java.util.HashSet;

public class UniqueTuple {
    public static void main(String[] args) {
        String input = "aabbbccdd";
        int lengthOfTuple=2;
        HashSet<String> result = uniqueTuples(input, lengthOfTuple);
        System.out.println(result);
    }

    private static HashSet<String> uniqueTuples(String input, int lengthOfTuple) {
        HashSet<String> result = new HashSet<>();
        for(int i=0;i<input.length();i++){
            if(i+lengthOfTuple<=input.length()){
               String output = input.substring(i, i+lengthOfTuple);
               result.add(output);
            }
        }
        return  result;
    }
}
