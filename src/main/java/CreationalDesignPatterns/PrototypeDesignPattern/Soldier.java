package CreationalDesignPatterns.PrototypeDesignPattern;

public class Soldier implements Cloneable
{
    private int health;

    private int speed;

    private int maxLifeTime;

    private int agility;

    private int damage;

    private int rank;

    private String weapon;

    private boolean isReadyForBattle;

    public Soldier(int health, int speed, int maxLifeTime, int agility, int damage, int rank, String weapon, boolean isReadyForBattle) {
        this.health = health;
        this.speed = speed;
        this.maxLifeTime = maxLifeTime;
        this.agility = agility;
        this.damage = damage;
        this.rank = rank;
        this.weapon = weapon;
        this.isReadyForBattle = isReadyForBattle;
    }

    public void showSoldierStats()
    {
        System.out.println("health: " + health +
                "\nSpeed: " + speed +
                "\nRemainingLifeTime: " + maxLifeTime +
                "\nAgility: " + agility +
                "\nDamage: " + damage +
                "\nRank: " + rank +
                "\nWeapon: " + weapon);

        if(isReadyForBattle)
            System.out.println("soldier is ready for fight");
        else
            System.out.println("soldier is not ready for fight");
    }

    @Override
    public Soldier clone() {
        try {
            Soldier clone = (Soldier) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isReadyForBattle() {
        return isReadyForBattle;
    }

    public void setReadyForBattle(boolean readyForBattle) {
        isReadyForBattle = readyForBattle;
    }
}
