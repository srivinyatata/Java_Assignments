package com.pms.model;

public class Product {
    private int pid;
    private String pname;
    private int qty;
    private double price;

    public Product() {}

    public Product(int pid, String pname, int qty, double price) {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
    }

    public int getPid() { return pid; }
    public void setPid(int pid) { this.pid = pid; }

    public String getPname() { return pname; }
    public void setPname(String pname) { this.pname = pname; }

    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
