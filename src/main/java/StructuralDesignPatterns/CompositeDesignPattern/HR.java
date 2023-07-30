package StructuralDesignPatterns.CompositeDesignPattern;

import java.util.Arrays;
import java.util.List;

public class HR extends Department
{
    @Override
    String getName() {
        return "HR";
    }

    @Override
    List<String> getEmployee() {
        return Arrays.asList("h1","h2","h3","h4");
    }
}
