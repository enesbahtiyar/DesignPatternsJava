package StructuralDesignPatterns.CompositeDesignPattern;

import java.util.List;
import java.util.stream.Collectors;

public class HeadDepartment extends Department
{
    List<Department> departments;

    public HeadDepartment(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    String getName() {
        return departments.stream()
                .map(Department::getName)
                .collect(Collectors.joining(","));
    }

    @Override
    List<String> getEmployee() {
        return departments.stream()
                .flatMap(t -> t.getEmployee().stream())
                .collect(Collectors.toList());
    }
}
