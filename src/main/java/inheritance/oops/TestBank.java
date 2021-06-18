package inheritance.oops;

public class TestBank {

    public static void main(String[] args) {

        Bank sbiBank = new SBIBank();
        sbiBank.bankType();
        System.out.println("ROI:" + sbiBank.rateOfInterest());

        Bank hdfcBank = new HDFCBank();
        hdfcBank.bankType();
        System.out.println("ROI of HDFC bank:" + hdfcBank.rateOfInterest());


    }
}
