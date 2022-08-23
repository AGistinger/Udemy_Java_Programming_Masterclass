package com.functional_interfaces_predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "\nEmployees 30 and under", employee ->employee.getAge() <= 30);
        printEmployeesByAge(employees, "\nEmployees younger than 25", employee -> employee.getAge() < 25);

        // Predicates have a method called test (boolean valued function), returns a boolean
        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greaterThan15.test(10));
        System.out.println(greaterThan15.and(lessThan100).test(50));

        // Works like
//        {
//            int i;
//            return i > 15;
//        }

        Random random = new Random();
        // Supplier
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);

        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }

//        employees.forEach(employee -> {
//            String lastName = employee.getName().substring(employee.getName().indexOf(' ')+1);
//            System.out.println("Last Name is: " + lastName);
//        });

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        Random random1 = new Random();
        for(Employee employee : employees) {
            if (random1.nextBoolean()) {
                System.out.println(getName(getFirstName, employee));
            } else {
                System.out.println(getName(getLastName, employee));
            }
        }

//        Function<Employee, String> upperCase = (employee) -> employee.getName().toUpperCase();
//        Function<String, String> concatenate = name -> name.substring(0, name.indexOf(' '));
//        Function<Employee, String> chainedFunction = upperCase.andThen(concatenate);
//        System.out.println(chainedFunction.apply(employees.get(0)));

        Function<Employee, String> upperCase = (employee) -> employee.getName().toUpperCase();
        Function<String, String> concatenate = name -> name.substring(0, name.indexOf(' '));
        Function<Employee, String> chainedFunction = upperCase.andThen(concatenate);
        System.out.println(chainedFunction.apply(employees.get(0)));

        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello World");
    }

    // a predicate is a lambda expression, so you pass a lambda when you call the method.
    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {

        System.out.println(ageText);
        System.out.println("==================");
        for(Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }

    private static String getName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }
}
