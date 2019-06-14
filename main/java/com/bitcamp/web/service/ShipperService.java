package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.ShipperDTO;

import org.springframework.stereotype.Component;

/**
 * ShipperService
 */
@Component
public interface ShipperService {
        public void addShipper(ShipperDTO shipper);
        public List<ShipperDTO> findShipper();
        public List<ShipperDTO> findShipperByword(ShipperDTO shipper);
        public ShipperDTO findShipperByShipperId(ShipperDTO shipper);
        public void updateShipper(ShipperDTO shipper);
        public void deleteShipper(ShipperDTO shipper);

}