package BehavioralDesignPatterns.ChainOfResponsibilityDesignPattern;

public class GeneralManager extends Approver{

    public GeneralManager() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        System.out.println("General Manager approved the loan!");
        return true;
    }
}
