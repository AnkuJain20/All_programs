package string.ques;

public class StringOpertions {

    public static void reverseString(String str){
        //Method 1: Using StringBuffer (Difference betweeb string buffer and builder)
        System.out.println("Input string:" + str);
        StringBuffer buffer = new StringBuffer(str);
        String reverseString = buffer.reverse().toString();
        System.out.println("Reversed string is: " + reverseString);
    }

    public static void palindromeString(String str){
        //Method 1: Without using reverse
        int length = str.length();
        System.out.println("length is  "+ length);
        boolean isPallindrome = true;

        for (int i = 0 ; i < length; i++){
            if (str.charAt(i) != str.charAt(length-1-i)){
                isPallindrome = false;
                break;
            }
        }
        System.out.println(isPallindrome);
    }

    public static void main(String[] args) {

        StringOpertions.reverseString("Hello");

        StringOpertions.palindromeString("abcdcba");

        StringOpertions.equalsAndDoubleEquals();

        StringOpertions.stringMutable();

        StringOpertions.removeSpaces(" my   name");
    }

    private static void removeSpaces(String str) {
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);
    }

    public StringOpertions( String str){

    }

    private static void equalsAndDoubleEquals() {
        String name1 = "ANKU";
        String name2 = "Anku";
        System.out.println("name1.equals(name2):: " + name1.equals(name2));
        System.out.println("name1.equalsIgnoreCase(name2) :: " +name1.equalsIgnoreCase(name2) );

        String name3 = "Anku";

       StringOpertions name4 = new StringOpertions("Anku");
        System.out.println("name2==name3 :: " + (name2 == name3));
        System.out.println("name3==name4 :: " + (name4.equals(name3)));


    }


    private static void stringMutable(){

        String str = "hello"; // str is pointing to hello in string pool
        str = str.concat( "world");  // hello world will be new string in pool and hello will remain as it's

        System.out.println(str);


    }


}
