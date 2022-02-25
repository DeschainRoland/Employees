package com.company;

public class Employee implements Comparable<Employee> {

    String surname, name, phone;
    int date;

    public Employee(String surname, String name,
                         String phone, int date) {
        this.surname = surname;
        this.name = name;
        this.phone = phone;
        this.date = date;
    }

    @Override
    public boolean equals(Object obj) {
        Employee odj1 = (Employee) obj;
        return name.equals(((Employee) obj).name);
    }

    @Override
    public String toString() {
        return "Surname: " + surname + "\n" +
                "Name: " + name + "\n" +
                "Date of Birthday: " + date + "\n" +
                "Phone:" + phone;
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.date > employee.date) {
            return 1;
        } else if (this.date < employee.date) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }
}
