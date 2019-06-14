package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.ProductDTO;

import org.springframework.stereotype.Repository;

/**
 * ProductMapper
 */
@Repository
public interface ProductMapper {
    public void addProduct(ProductDTO product);
    public List<ProductDTO> selectProduct();
    public List<ProductDTO> selectProductByword(ProductDTO product);
    public ProductDTO selectProductByProductId(ProductDTO product);
    public void updateProduct(ProductDTO produc);
    public void deleteProduct(ProductDTO product);

    
}