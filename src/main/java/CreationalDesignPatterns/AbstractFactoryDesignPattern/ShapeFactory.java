package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class ShapeFactory extends AbstractFactory
{
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType)
    {
        if(shapeType == null)
        {
            return null;
        }

        if(shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("triangle"))
            return new Triangle();
        else if(shapeType.equalsIgnoreCase("square"))
            return new Square();
        else
            return null;
    }
}
