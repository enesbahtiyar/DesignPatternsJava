package StructuralDesignPatterns.DecaratorDesignPattern;

public class IPhoneDecorator implements Phone
{
    //Phone basicPhone = new IPhone();
    protected Phone basicPhone;

    public IPhoneDecorator(IPhone basePhone)
    {
        this.basicPhone = basePhone;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public int cameraCount() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
