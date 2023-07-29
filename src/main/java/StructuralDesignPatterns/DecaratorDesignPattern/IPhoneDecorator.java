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
        return "IPhone";
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
