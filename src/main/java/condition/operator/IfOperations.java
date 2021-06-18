package condition.operator;

public class IfOperations {

    public static void checkNumberIsNegative(int num){
        if(num<0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is positive");
        }
    }

    public static void checkNumberIsOddOrEven(int num){
        if(num %2 == 0){
            System.out.println(" number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }

    public static int  getMaxNumberUsingTernaryOperator(int num1, int num2){
//        if(num1>num2){
//            System.out.println(" num1 is greater than num2");
//        }
//        else {
//            System.out.println("num2 is greater than num1" );
//        }
//        this is ternery operator, we use this in place of if and else statement
//        variable = (condition) ? TrueExpression : FlaseExpression
        String result = (num1>num2) ? "num1 is greater than num2": "num2 is greater than num1";
        System.out.println(result);
        //        or
        int updatedResult = (num1>num2) ? num1: num2;
        return updatedResult;
    }


    public static void printMonthUsingSwitch(int month) {
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("may");
            default :
                System.out.println("No month after this");
        }
    }

    public static void main(String[] args) {
        IfOperations.checkNumberIsNegative(-20);

        IfOperations.checkNumberIsOddOrEven(25);

        int maxNum = IfOperations.getMaxNumberUsingTernaryOperator(40, 25);
        System.out.println("MaxNum:"+maxNum);

        IfOperations.printMonthUsingSwitch(3);
    }
}
