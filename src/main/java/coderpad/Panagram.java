package coderpad;

public class Panagram {
static  String input = "appleisgood";
    public static void main(String[] args) {
String missingletter =findMissingLetter("appleisgood");
        System.out.println("Missing letters are "+ missingletter);
    }
    public static String findMissingLetter(String input){
        StringBuilder answer = new StringBuilder(" ");
        String albhabet = "abcdefghijklmnopqrstuvwxyz";
      input=  input.toLowerCase();
      for(int i=0; i<26;i++){
         char ch = albhabet.charAt(i);
          String temp = String.valueOf(ch);
         if(!input.contains(temp)){
             answer.append(ch);
         }
      }
      return answer.toString();
    }
}
