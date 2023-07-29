package StructuralDesignPatterns.DecaratorDesignPattern;

public class DecoratorRunner
{
    public static void main(String[] args) {
        Phone phone = new IPhone13ProMax(new IPhone());
        System.out.println(phone.getName());
        System.out.println(phone.cameraCount());
        System.out.println(phone.getPrice());
    }
}
