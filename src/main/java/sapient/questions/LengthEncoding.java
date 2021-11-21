package sapient.questions;

public class LengthEncoding {
    public static void main(String[] args) {
        String input = "aaabbc";
        String encoded = lengthEncoding(input);
        System.out.println("Encoded string is " + encoded);
    }

    private static String lengthEncoding(String input) {
        int currentLength = 1;
        char[] ch = input.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            if (ch[i] == ch[i - 1]) {
                currentLength++;
            } else {
                answer.append(ch[i - 1]);
                answer.append(currentLength);
                currentLength = 1;
            }
        }
        answer.append(input.charAt(input.length()-1));
        answer.append(currentLength);
        return answer.toString();
    }
}
