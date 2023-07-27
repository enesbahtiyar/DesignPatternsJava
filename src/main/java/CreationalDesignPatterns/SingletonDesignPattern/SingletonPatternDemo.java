package CreationalDesignPatterns.SingletonDesignPattern;

public class SingletonPatternDemo
{
    public static void main(String[] args)
    {
        //SingletonObject object1 = new SingletonObject();
        //SingletonObject object2 = new SingletonObject();

        SingletonObject object3 = SingletonObject.getInstance();
        System.out.println(object3.message);
        object3.changeMessage();
        SingletonObject object4 = SingletonObject.getInstance();
        System.out.println(object4.message);
    }
}
