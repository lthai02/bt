package com.example.Decorator_Pattern.decorator;

import com.example.Decorator_Pattern.base.Decor_Employee;

public class GeneralStaff implements Decor_Employee {
    private String name;

    public GeneralStaff(String name) {
        this.name = name;
    }

    @Override
    public void NhiemVu() {
        // TODO Auto-generated method stub
        System.out.println(name + " - Nhân viên: Pha trà, giữ xe.");
    }

}
