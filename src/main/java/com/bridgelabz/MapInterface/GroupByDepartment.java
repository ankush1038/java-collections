package com.bridgelabz.MapInterface;

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding employees to the list
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Printing the grouped employees
        System.out.println(groupedEmployees);
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            String department = emp.department;

            // If department is not present, add a new list
            if (!departmentMap.containsKey(department)) {
                departmentMap.put(department, new ArrayList<>());
            }

            // Add employee to the respective department
            departmentMap.get(department).add(emp);
        }
        return departmentMap;
    }
}

