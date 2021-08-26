package sapient.questions;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String input= "cat good dog act doog sat tas god dog";
         setOfAnagrams( input);
    }
    //words should be split on the basis of space.

    private static void setOfAnagrams(String input) {

        Map<String, ArrayList<String>> map = new HashMap<>();
    String [] words = input.split(" ");
    for(String word : words){
        String wsorted = getSortedWord(word);
//        System.out.println("sorted word" + wsorted);
      if(map.containsKey(wsorted)){
           map.get(wsorted).add(word);
       }
       else{
           ArrayList<String> wordList= new ArrayList<>();
           wordList.add(word);
           map.put(wsorted,wordList);
       }

       }

        for(String keys :map.keySet()){
            for(String anagram: map.get(keys)) {
                System.out.print(anagram + " ");
            }


        }


    }

    private static String getSortedWord(String word) {
        char[] ch =(word.toCharArray());
        Arrays.sort(ch);
        String wsorted = new String( ch);
        return wsorted;
    }
}

