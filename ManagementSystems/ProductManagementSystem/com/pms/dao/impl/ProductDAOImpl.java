package com.pms.dao.impl;

import com.pms.dao.ProductDAO;
import com.pms.model.Product;
import java.util.Scanner;

public class ProductDAOImpl implements ProductDAO {
    public static Product[] products = null;
    Scanner sc = new Scanner(System.in);

    public void addProducts() {
        System.out.println("Enter number of products:");
        int size = sc.nextInt();
        products = new Product[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Product ID:");
            int pid = sc.nextInt();
            System.out.println("Enter Product Name:");
            String pname = sc.next();
            System.out.println("Enter Quantity:");
            int qty = sc.nextInt();
            System.out.println("Enter Price:");
            double price = sc.nextDouble();
            products[i] = new Product(pid, pname, qty, price);
        }
    }

    public Product[] viewAllProducts() {
        return products;
    }

    public Product viewProduct(int pid) {
        for (Product p : products) {
            if (p != null && p.getPid() == pid) {
                return p;
            }
        }
        return null;
    }

    public int updateProduct(int pid) {
        // Example update: quantity
        for (Product p : products) {
            if (p != null && p.getPid() == pid) {
                System.out.println("Enter new Quantity:");
                p.setQty(sc.nextInt());
                return 1;
            }
        }
        return 0;
    }

    public int deleteProduct(int pid) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getPid() == pid) {
                products[i] = null;
                return 1;
            }
        }
        return 0;
    }
}
