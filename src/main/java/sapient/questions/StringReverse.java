package sapient.questions;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Good Night";
        String rev = " ";
        int l = str.length();
        System.out.println("Reverse String is ");

//        first method by using charAt method
        for (int i = l - 1; i >= 0; i--) {
//            char c = str.charAt(i);
//            System.out.print(c);, here we have used print(c) not println, thats wht its peinting in same line
            rev = rev + str.charAt(i);
        }
        System.out.println("----" + rev);

//        2nd method by using String  buffer class
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());


//     3rd method by using String Builder class
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb1.reverse());
    }

}
