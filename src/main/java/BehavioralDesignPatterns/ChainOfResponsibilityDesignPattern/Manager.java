package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern;

public class Manager extends Approver{

    // Manager also has an upper level role
    public Manager(Approver chief) {
        super(chief);
    }

    // Can approve loans up to 500 Euro
    @Override
    boolean approveLoan(int amount) {
        if (amount<500)
            System.out.println("Loan offer approved!");
        else if (chief != null){
            System.out.println("The given amount exceeds the limit that this officer can approve. Directing to the chief.");
            return chief.approveLoan(amount);
        }
        return true;
    }
}
