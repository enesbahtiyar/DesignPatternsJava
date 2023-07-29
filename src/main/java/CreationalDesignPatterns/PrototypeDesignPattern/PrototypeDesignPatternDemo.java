package CreationalDesignPatterns.PrototypeDesignPattern;

public class PrototypeDesignPatternDemo
{
    public static void main(String[] args)
    {
        Soldier soldier1 = new Soldier(100, 50, 25, 70, 60, 1, "sword", true);
        soldier1.showSoldierStats();

        System.out.println("\n*****************************\n");

        Soldier soldier2 = new Soldier(100, 50, 25, 70, 60, 3, "sword", false);
        soldier2.showSoldierStats();

        Soldier soldier3 = soldier2.clone();

        System.out.println("\n*****************************\n");

        soldier3.showSoldierStats();
        soldier3.setReadyForBattle(true);
        soldier3.showSoldierStats();

    }
}
