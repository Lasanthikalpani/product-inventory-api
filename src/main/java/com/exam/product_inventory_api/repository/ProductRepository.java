package com.exam.product_inventory_api.repository;

import com.exam.product_inventory_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository provides all basic CRUD methods (save, findAll, findById, deleteById)
}