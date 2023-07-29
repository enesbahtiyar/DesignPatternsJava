package StructuralDesignPatterns.DecaratorDesignPattern;

public class IPhone13Pro extends IPhoneDecorator
{
    public IPhone13Pro(IPhone basePhone) {
        super(basePhone);
    }

    @Override
    public String getName() {
        return super.getName() + "13 pro";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount() + 1;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }
}
