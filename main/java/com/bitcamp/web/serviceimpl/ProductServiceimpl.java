package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.domain.ProductDTO;
import com.bitcamp.web.service.ProductService;

import org.springframework.stereotype.Service;

/**
 * ProductServiceimpl
 */
@Service
public class ProductServiceimpl implements ProductService {

    @Override
    public void addProduct(ProductDTO product) {

    }

    @Override
    public List<ProductDTO> findProduct() {
        return null;
    }

    @Override
    public List<ProductDTO> findProductByword(ProductDTO product) {
        return null;
    }

    @Override
    public ProductDTO findProductByProductId(ProductDTO product) {
        return null;
    }

    @Override
    public void updateProduct(ProductDTO produc) {

    }

    @Override
    public void deleteProduct(ProductDTO product) {

    }

    
}