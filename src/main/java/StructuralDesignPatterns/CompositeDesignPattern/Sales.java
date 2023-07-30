package StructuralDesignPatterns.CompositeDesignPattern;
import java.util.Arrays;
import java.util.List;

public class Sales extends Department{

    @Override
    String getName() {
        return "Sales";
    }

    @Override
    List<String> getEmployee() {
        return Arrays.asList("s1","s2","s3","s4");
    }
}