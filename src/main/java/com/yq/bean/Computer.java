package com.yq.bean;

public class Computer {
    private String name;
    private int byteNum;
    private int price;

    public Computer(String name, int byteNum, int price) {
        this.name = name;
        this.byteNum = byteNum;
        this.price = price;
    }

    public Computer() {
        System.out.println("computer is init .....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getByteNum() {
        return byteNum;
    }

    public void setByteNum(int byteNum) {
        this.byteNum = byteNum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", byteNum=" + byteNum +
                ", price=" + price +
                '}';
    }
}
