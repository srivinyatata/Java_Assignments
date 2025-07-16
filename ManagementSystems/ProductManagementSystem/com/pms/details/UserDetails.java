package com.pms.details;

import com.pms.dao.impl.ProductDAOImpl;
import com.pms.model.Product;
import java.util.Scanner;

public class UserDetails {
    Scanner sc = new Scanner(System.in);
    ProductDAOImpl productDao = new ProductDAOImpl();

    public void adminMenu() {
        while (true) {
            System.out.println("1) Add Products");
            System.out.println("2) View All Products");
            System.out.println("3) View Product");
            System.out.println("4) Update Product");
            System.out.println("5) Delete Product");
            System.out.println("6) Back");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: productDao.addProducts(); break;
                case 2:
                    for (Product p : productDao.viewAllProducts()) {
                        if (p != null) System.out.println(p.getPid() + "\t" + p.getPname());
                    } break;
                case 3:
                    System.out.print("Product ID: ");
                    Product p = productDao.viewProduct(sc.nextInt());
                    if (p != null) System.out.println(p.getPid() + "\t" + p.getPname());
                    break;
                case 4:
                    System.out.print("Product ID: ");
                    productDao.updateProduct(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Product ID: ");
                    productDao.deleteProduct(sc.nextInt());
                    break;
                case 6: return;
            }
        }
    }

    public void userMenu() {
        while (true) {
            System.out.println("1) View All Products");
            System.out.println("2) View Product");
            System.out.println("3) Update Product");
            System.out.println("4) Back");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (Product p : productDao.viewAllProducts()) {
                        if (p != null) System.out.println(p.getPid() + "\t" + p.getPname());
                    } break;
                case 2:
                    System.out.print("Product ID: ");
                    Product p = productDao.viewProduct(sc.nextInt());
                    if (p != null) System.out.println(p.getPid() + "\t" + p.getPname());
                    break;
                case 3:
                    System.out.print("Product ID: ");
                    productDao.updateProduct(sc.nextInt());
                    break;
                case 4: return;
            }
        }
    }
}
