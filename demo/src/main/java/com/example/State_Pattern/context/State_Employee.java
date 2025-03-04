package com.example.State_Pattern.context;

import com.example.State_Pattern.state.State_NhanVien;
import com.example.State_Pattern.state.State_NhiemVu;

public class State_Employee {
    private int id;
    private String name;
    private State_NhiemVu state_NhiemVu;

    public State_Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.state_NhiemVu = new State_NhanVien();
    }

    public void setStateNhiemVu() {
        this.state_NhiemVu = state_NhiemVu;
    }

    public void showNhiemVu() {
        System.out.printf(name + " - ");
        state_NhiemVu.State_NhiemVu();
    }
}
