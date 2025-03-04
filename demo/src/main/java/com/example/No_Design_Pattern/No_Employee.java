package com.example.No_Design_Pattern;

public class No_Employee {
    private int id;
    private String name;
    private String position;

    public No_Employee() {
    }

    public No_Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        if (position == null) {
            return "chua co chuc vu";
        }
        switch (position) {
            case "GIAMDOC":
                return "giam doc";
            case "PHOGIAMDOC":
                return "pho giam doc";
            case "KETOAN":
                return "ke toan";
            case "NHANVIEN":
                return "nhan vien";
            default:
                return "chuc vu khong hop le";
        }
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
