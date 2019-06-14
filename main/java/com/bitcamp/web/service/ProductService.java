package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.ProductDTO;

import org.springframework.stereotype.Component;

/**
 * ProductService
 */
@Component
public interface ProductService {
        public void addProduct(ProductDTO product);
        public List<ProductDTO> findProduct();
        public List<ProductDTO> findProductByword(ProductDTO product);
        public ProductDTO findProductByProductId(ProductDTO product);
        public void updateProduct(ProductDTO produc);
        public void deleteProduct(ProductDTO product);
    
}