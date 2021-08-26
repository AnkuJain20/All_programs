package sapient.questions;

public class RepeatedNumberAfterDecimal {
    public static String fractionRepresentation(int num, int den) {
        boolean repeated = false;
        double d = (double) num / den;
        String strVal = String.valueOf(d);
        String result = strVal.split("\\.")[0];
        String decimalStr = strVal.split("\\.")[1];
        String subString = null;
        int i = 1;
        while (i < decimalStr.length() - 1) {
            if (decimalStr.substring(0, i).equals(decimalStr.substring(i, i + i))) {
                repeated = true;
                subString = decimalStr.substring(0, i);
                break;
            }
            i++;
        }
        if (repeated) {
            result = result + ".(" + subString + ")";
        } else {
            result = result + "." + decimalStr;
        }
        System.out.println(result);
        return result;
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
