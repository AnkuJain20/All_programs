package sapient.questions;

public class RepeatedNumberAfterDecimal {
    public static String fractionRepresentation(int num, int den) {
      float div = (float) (num*1.0f/den);
      String div_str = String.valueOf(div);
      String [] str = div_str.split("\\.");
      String before_decimal = str[0];
      String after_decimal = str[1];
      // now we need to convert .33333333 -> .(3)

      StringBuilder ans = new StringBuilder();
      ans.append(after_decimal.charAt(0));
      boolean isRepeated = false;

      for (int i = 1 ; i < after_decimal.length(); i++) {
          if (2*i <= after_decimal.length() && after_decimal.substring(0, i).equals(after_decimal.substring(i, 2*i))) {
              isRepeated = true ;
              break;
          } else {
              ans.append(after_decimal.charAt(i));
          }
      }

      if (isRepeated) {
          return before_decimal + ".(" + ans + ")" ;
      }

      return div_str ;
    }

    public static void main(String args[]) {
        // float f=6/11f;
        // System.out.println(f);
        System.out.println(fractionRepresentation(1, 2) + " " + fractionRepresentation(1, 3) + " "
                + fractionRepresentation(6, 11));

        if (fractionRepresentation(1, 2).equals("0.5") && fractionRepresentation(6, 11).equals("0.(54)")
                && fractionRepresentation(1, 3).equals("0.(3)")) {
            System.out.println("All passed");
        } else {
            System.out.println("Failed");
        }

    }
}
