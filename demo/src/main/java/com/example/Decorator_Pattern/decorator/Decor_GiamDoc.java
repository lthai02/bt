package com.example.Decorator_Pattern.decorator;

import com.example.Strategy_Pattern.models.Employee;

public class Decor_GiamDoc extends RoleDecorator {

    public Decor_GiamDoc(Employee decoratedEmployee) {
        super(decoratedEmployee);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void NhiemVu() {
        super.NhiemVu();
        System.out.println("Thêm nhiệm vụ: Giám đốc - Ra quyết định chiến lược, quản lý công ty.");
    }
}