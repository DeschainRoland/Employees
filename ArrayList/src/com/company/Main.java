package com.company;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee1 = new Employee("Win", "Disel",
                "89501", 2000);
        Employee employee2 = new Employee("Renaud", "Jean",
                "895012", 1000);
        Employee employee3 = new Employee(in.nextLine(), in.nextLine(),
                in.nextLine(), in.nextInt());
        Employes employes = new Employes();
        employes.add(employee1);
        employes.add(employee2);
        employes.add(employee3);
        employes.print();
        employes.delete("8950123");
        System.out.println();
        employes.print();
        employes.sortDate();
        System.out.println();
        employes.print();
    }
}
