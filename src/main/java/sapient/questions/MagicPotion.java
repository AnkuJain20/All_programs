package sapient.questions;

public class MagicPotion {
    public static void main(String[] args) {
        String input = "ABCABCDABCABCDE";
        String resulte = magicPotion(input);
        System.out.println(resulte);
    }

    private static String magicPotion(String input) {
        int len = input.length();
        int current=1;
        StringBuffer stringBuffer  = new StringBuffer(""+input.charAt(0));
        while(current < len){
            if(2*current <= len){
                String beforeCurrent = input.substring(0,current);
                String afterCurrent = input.substring(current,2*current);
                if(beforeCurrent.equals(afterCurrent)){
                    stringBuffer.append("*");
                    current = 2*current;
                } else {
                    stringBuffer.append(input.charAt(current));
                    current++;
                }

            }
            else {
                stringBuffer.append(input.charAt(current));
                current++;
            }

        }
        return stringBuffer.toString();
    }
}
