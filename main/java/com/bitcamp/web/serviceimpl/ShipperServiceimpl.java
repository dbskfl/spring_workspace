package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.domain.ShipperDTO;
import com.bitcamp.web.service.ShipperService;

import org.springframework.stereotype.Service;

/**
 * ShipperServiceimpl
 */
@Service
public class ShipperServiceimpl implements ShipperService {

    @Override
    public void addShipper(ShipperDTO shipper) {

    }

    @Override
    public List<ShipperDTO> findShipper() {
        return null;
    }

    @Override
    public List<ShipperDTO> findShipperByword(ShipperDTO shipper) {
        return null;
    }

    @Override
    public ShipperDTO findShipperByShipperId(ShipperDTO shipper) {
        return null;
    }

    @Override
    public void updateShipper(ShipperDTO shipper) {

    }

    @Override
    public void deleteShipper(ShipperDTO shipper) {

    }

    
}