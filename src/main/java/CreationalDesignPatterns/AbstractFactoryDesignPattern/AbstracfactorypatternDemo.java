package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class AbstracfactorypatternDemo
{
    public static void main(String[] args)
    {
        AbstractFactory factory1 = FactoryProducer.getFactory("shape");
        Shape shape1 = factory1.getShape("circle");
        shape1.draw();

        AbstractFactory factory2 = FactoryProducer.getFactory("color");
        Color color = factory2.getColor("red");
        color.fill();
    }
}
