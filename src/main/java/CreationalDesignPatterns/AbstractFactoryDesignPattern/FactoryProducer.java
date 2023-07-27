package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class FactoryProducer
{
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("Shape"))
            return new ShapeFactory();
        if(choice.equalsIgnoreCase("color"))
            return new ColorFactory();
        else
            return null;
    }
}
