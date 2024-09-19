package com.example.backendJava.service.product;

import com.example.backendJava.request.AddProductRequest;
import com.example.backendJava.request.ProductUpdateRequest;
import com.example.backendJava.entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(AddProductRequest request);

    Product updateProduct(ProductUpdateRequest request, Long productId);

    List<Product> getAllProducts();

    List<Product> getProductByCategory(String category);

    List<Product> getProductByBrand(String brand);

    List<Product> getProductByCategoryAndBrand(String category, String brand);

    List<Product> getProductByName(String name);

    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);

    Product getProductById(Long id);

    void deleteProduct(Long id);
}
