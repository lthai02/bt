package com.example.Decorator_Pattern.decorator;

import com.example.Strategy_Pattern.models.Employee;

public class Decor_PhoGiamDoc extends RoleDecorator {

    public Decor_PhoGiamDoc(Employee decoratedEmployee) {
        super(decoratedEmployee);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void NhiemVu() {
        super.NhiemVu();
        System.out.println("Thêm nhiệm vụ: Phó Giám Đốc - Phụ trách khi giám đốc đi vắng.");
    }
}
