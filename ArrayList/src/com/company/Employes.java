package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Employes {

    ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee employee){
        employees.add(employee);
        employees.sort(new CompName());
    }

    public void print(){
        Iterator iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println();
        }
    }

    public void delete(String phone){
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).phone.equals(phone))
                employees.remove(i);
        }
    }

    public void sortDate(){
        employees.sort(new CompDate());
    }

    class  CompName implements Comparator<Employee>{
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getName().compareTo(employee2.getName());
        }
    }

    class CompDate implements Comparator<Employee>{
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.compareTo(employee2);
        }
    }
}
