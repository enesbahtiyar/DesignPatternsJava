package StructuralDesignPatterns.DecaratorDesignPattern;

public class IPhone13ProMax extends IPhone13Pro
{
    public IPhone13ProMax(IPhone basePhone) {
        super(basePhone);
    }

    @Override
    public String getName() {
        return super.getName() + "max";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount();
    }

    @Override
    public double getPrice() {
        return super.getPrice() +100;
    }
}
