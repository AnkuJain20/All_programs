package sapient.questions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String input = "BbaUkngalore";
        char result = firstNonRepeating(input);
        System.out.println(" First Non repeating is "+ result);
    }

    private static char firstNonRepeating(String input) {
        Map<Character, Integer> map = new HashMap<>();
       input= input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (map.containsKey(ch)) {
                int currentCount = map.get(ch);
                currentCount++;
                map.put(ch, currentCount);
            } else {
                map.put(ch, 1);
            }
        }

        for(int i=0;i<input.length();i++){
            if(map.get(input.charAt(i))==1){
                return input.charAt(i);
            }
        }
        return 'a';
    }
}
