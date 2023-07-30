package StructuralDesignPatterns.CompositeDesignPattern;

import java.util.Arrays;
import java.util.List;

public class Finance extends Department{

    @Override
    String getName() {
        return "Finance";
    }

    @Override
    List<String> getEmployee() {
        return Arrays.asList("f1","f2","f3","f4");
    }
}