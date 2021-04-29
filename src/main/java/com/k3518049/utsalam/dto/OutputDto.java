package com.k3518049.utsalam.dto;

public class OutputDto <T>{
    private T info;
    private T allowance;
    private T basicSalary;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getAllowance() {
        return allowance;
    }

    public void setAllowance(T allowance) {
        this.allowance = allowance;
    }

    public T getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(T basicSalary) {
        this.basicSalary = basicSalary;
    }
}
