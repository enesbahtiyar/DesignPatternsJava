package CreationalDesignPatterns.SingletonDesignPattern;

public class SingletonObject
{
    String message = "Hey there";

    private static SingletonObject instance = new SingletonObject();

    private SingletonObject()
    {

    }

    public static SingletonObject getInstance() {
        return instance;
    }

    public void changeMessage()
    {
        this.message =  this.message + "updated message";
    }
}
