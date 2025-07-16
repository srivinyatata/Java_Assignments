package com.pms.dao;

import com.pms.model.Product;

public interface ProductDAO {
    void addProducts();
    Product[] viewAllProducts();
    Product viewProduct(int pid);
    int updateProduct(int pid);
    int deleteProduct(int pid);
}
