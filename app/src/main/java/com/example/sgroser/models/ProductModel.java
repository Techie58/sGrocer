package com.example.sgroser.models;

public class ProductModel {
    private String name,img,status;
    private double discount,price;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductModel(String name, String img, String status, double discount, double price, int id) {
        this.name = name;
        this.img = img;
        this.status = status;
        this.discount = discount;
        this.price = price;
        this.id = id;
    }
}
