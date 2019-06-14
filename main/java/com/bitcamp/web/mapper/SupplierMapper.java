package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.SupplierDTO;

import org.springframework.stereotype.Repository;

/**
 * SupplierMapper
 */
@Repository
public interface SupplierMapper {
    public void addSupplier(SupplierDTO supplier);
        public List<SupplierDTO> selectSupplier();
        public List<SupplierDTO> selectSupplierByword(SupplierDTO supplier);
        public SupplierDTO selectSupplierBySupplierId(SupplierDTO supplier);
        public void updateSupplier(SupplierDTO supplier);
        public void deleteSupplier(SupplierDTO supplier);

    
}