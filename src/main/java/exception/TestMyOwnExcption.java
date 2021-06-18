package exception;

public class TestMyOwnExcption {
    static void employeeAge(int age) throws AgeNegativeException {
        if (age < 0) {
            throw new AgeNegativeException("Age should not be less than zero");
        } else {
            System.out.println(" Age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            employeeAge(-3);
        } catch (AgeNegativeException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Always runs");
        }
    }

}
