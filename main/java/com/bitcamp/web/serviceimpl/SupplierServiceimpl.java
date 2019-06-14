package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.domain.SupplierDTO;
import com.bitcamp.web.service.SupplierService;

import org.springframework.stereotype.Service;

/**
 * SupplierServiceimpl
 */
@Service
public class SupplierServiceimpl implements SupplierService {

    @Override
    public void addSupplier(SupplierDTO supplier) {

    }

    @Override
    public List<SupplierDTO> findSupplier() {
        return null;
    }

    @Override
    public List<SupplierDTO> findSupplierByword(SupplierDTO supplier) {
        return null;
    }

    @Override
    public SupplierDTO findSupplierBySupplierId(SupplierDTO supplier) {
        return null;
    }

    @Override
    public void updateSupplier(SupplierDTO supplier) {

    }

    @Override
    public void deleteSupplier(SupplierDTO supplier) {

    }

    
}