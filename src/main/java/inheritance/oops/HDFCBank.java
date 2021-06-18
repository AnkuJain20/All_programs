package inheritance.oops;

public class HDFCBank extends Bank{



    @Override
    public void bankType() {
        System.out.println("Bank is not nationalized");
    }

    @Override
    public int rateOfInterest() {
        return 9;
    }
}
