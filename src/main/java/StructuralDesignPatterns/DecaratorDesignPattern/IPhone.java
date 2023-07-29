package StructuralDesignPatterns.DecaratorDesignPattern;

public class IPhone implements Phone
{
    @Override
    public String getName() {
        return "iPhone ";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 350;
    }
}
