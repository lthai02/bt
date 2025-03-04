package com.example.Decorator_Pattern.decorator;

import com.example.Strategy_Pattern.models.Employee;

public class Decor_KeToan extends RoleDecorator {

    public Decor_KeToan(Employee decoratedEmployee) {
        super(decoratedEmployee);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void NhiemVu() {
        super.NhiemVu();
        System.out.println("Thêm nhiệm vụ: Kế toán - Tính toán tiền cho công ty, nộp tiền vào tài khoản.");
    }
}
