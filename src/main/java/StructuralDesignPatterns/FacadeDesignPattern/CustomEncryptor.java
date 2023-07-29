package StructuralDesignPatterns.FacadeDesignPattern;

public class CustomEncryptor
{
    public static void main(String[] args)
    {
        String enes = "enes";
        /*
        AESEncryptor aes = new AESEncryptor();
        aes.encrypt(enes, "boncuk");

        MD5Encryptor md5 = new MD5Encryptor();
        md5.encrypt(enes);

        SHAEncryptor sha = new SHAEncryptor();
        sha.encrypt(enes, "boncuk");
         */

        FacadeEncryptor facadeEncryptor = new FacadeEncryptor();
        facadeEncryptor.encryptor(enes,FacadeEncryptor.EncryptType.MD5);
        facadeEncryptor.encryptor(enes,FacadeEncryptor.EncryptType.AES);
        facadeEncryptor.encryptor(enes,FacadeEncryptor.EncryptType.SHA);
    }
}
