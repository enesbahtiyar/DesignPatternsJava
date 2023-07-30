package StructuralDesignPatterns.ProxyDesignPattern;

public class ProxyImageClass implements ImageGenerator
{
    private String fullPath;

    private RealImageClass realImageClass;

    public ProxyImageClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImageName()
    {
        if(realImageClass == null)
        {
            realImageClass = new RealImageClass(fullPath);
        }
        realImageClass.showImageName();

    }
}
