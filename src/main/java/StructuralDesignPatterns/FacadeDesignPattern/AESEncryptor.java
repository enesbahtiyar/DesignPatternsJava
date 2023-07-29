package StructuralDesignPatterns.FacadeDesignPattern;

public class AESEncryptor
{
    public void encrypt(String text, String securityKey)
    {
        System.out.println("**AES**  "+text + securityKey+"  **AES**");
    }
}
