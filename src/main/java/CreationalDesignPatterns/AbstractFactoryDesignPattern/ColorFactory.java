package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("red"))
            return new Red();
        else if (color.equalsIgnoreCase("blue"))
            return new Blue();
        else if (color.equalsIgnoreCase("greem"))
            return new Green();
        else
            return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
