package com.example;

import com.example.Decorator_Pattern.base.Decor_Employee;
import com.example.Decorator_Pattern.decorator.GeneralStaff;
import com.example.No_Design_Pattern.No_Employee;
import com.example.State_Pattern.context.State_Employee;
import com.example.Strategy_Pattern.models.Employee;
import com.example.Strategy_Pattern.strategy.KeToan;
import com.example.Strategy_Pattern.strategy.NhanVien;

public class Main {
    public static void main(String[] args) {
        // Strategy Pattern
        Employee e1 = new Employee(1, "Hai", new NhanVien());
        Employee e2 = new Employee(2, "Linh", new KeToan());
        e1.NhiemVu();
        e2.NhiemVu();

        // State Pattern
        State_Employee se1 = new State_Employee(1, "Hai?");

        se1.showNhiemVu();

        // decorator
        Decor_Employee de1 = new GeneralStaff("Hai...");
        de1.NhiemVu();

        // No design pattern
        No_Employee employee = new No_Employee(1, "Le Thanh Hai", "GIAMDOC");
        System.out.println("Chuc vu: " + employee.getPosition());
        employee.getPosition();
    }
}