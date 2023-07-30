package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern;

public class Official extends Approver{

    // Above role of this class
    public Official(Approver chief) {
        super(chief);
    }

    // Officials can approve up to 100 Euro of loan offers.
    @Override
    boolean approveLoan(int amount) {
        if (amount<100)
            System.out.println("Loan offer approved!");
        else if (chief != null){
            System.out.println("The given amount exceeds the limit that this officer can approve. Directing to the chief.");
            return chief.approveLoan(amount);
        }
        return true;
    }
}