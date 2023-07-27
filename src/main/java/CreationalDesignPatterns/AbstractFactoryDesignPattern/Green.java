package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class Green implements Color
{
    @Override
    public void fill() {
        System.out.println("green");
    }
}
