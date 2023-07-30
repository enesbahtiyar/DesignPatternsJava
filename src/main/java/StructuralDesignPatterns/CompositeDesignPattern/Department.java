package StructuralDesignPatterns.CompositeDesignPattern;

import java.util.List;

public abstract class Department
{
    // Name of a Department
    abstract String getName();

    // List of a Departments Employees
    abstract List<String> getEmployee();
}
