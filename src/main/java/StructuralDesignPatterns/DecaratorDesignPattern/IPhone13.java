package StructuralDesignPatterns.DecaratorDesignPattern;

public class IPhone13 extends IPhoneDecorator
{
    public IPhone13(IPhone basePhone) {
        super(basePhone);
    }

    @Override
    public String getName() {
        return super.getName() + "13";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }
}
