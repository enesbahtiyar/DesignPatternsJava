package StructuralDesignPatterns.ProxyDesignPattern;

public class RealImageClass implements ImageGenerator
{
    private String fullPath;

    public RealImageClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImageName()
    {
        System.out.println("displaying the image name [...]");
    }

    public void loadImage()
    {
        System.out.println("Image is loading");
    }

    public void changeImage()
    {
        System.out.println("Image has been changed");
    }
}
