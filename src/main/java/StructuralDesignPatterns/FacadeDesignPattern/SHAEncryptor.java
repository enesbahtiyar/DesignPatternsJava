package StructuralDesignPatterns.FacadeDesignPattern;

public class SHAEncryptor
{
    public void encrypt(String text, String securityKey)
    {
        System.out.println("**SHA**  " + securityKey + text + "  **SHA**");
    }
}
