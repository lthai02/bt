package com.example.Strategy_Pattern.models;

import com.example.Strategy_Pattern.strategy.NhiemVu;

public class Employee {
    private int id;
    private String name;
    private NhiemVu nhiemVu;

    public Employee(int id, String name, NhiemVu nhiemVu) {
        this.id = id;
        this.name = name;
        this.nhiemVu = nhiemVu;
    }

    public void NhiemVu() {
        System.out.printf(name + " - ");
        nhiemVu.NhiemVu();
    }

    public void setNhiemVu(NhiemVu nhiemVu) {
        this.nhiemVu = nhiemVu;
    }
}
