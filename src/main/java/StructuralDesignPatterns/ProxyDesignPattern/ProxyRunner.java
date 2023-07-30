package StructuralDesignPatterns.ProxyDesignPattern;

public class ProxyRunner
{
    public static void main(String[] args)
    {
        ImageGenerator proxyImage1 = new ProxyImageClass("c://image1.png");
        ImageGenerator proxyImage2 = new ProxyImageClass("c://image2.png");

        proxyImage1.showImageName();
        proxyImage2.showImageName();
    }
}
