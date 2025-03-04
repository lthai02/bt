package com.example.Decorator_Pattern.decorator;

import com.example.Decorator_Pattern.base.Decor_Employee;
import com.example.Strategy_Pattern.models.Employee;

public class RoleDecorator implements Decor_Employee {
    protected Employee decoratedEmployee;

    public RoleDecorator(Employee decoratedEmployee) {
        this.decoratedEmployee = decoratedEmployee;
    }

    @Override
    public void NhiemVu() {
        decoratedEmployee.NhiemVu();
    }
}
