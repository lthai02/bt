package com.example;

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
    }
}