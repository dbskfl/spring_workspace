package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.ShipperDTO;

import org.springframework.stereotype.Repository;

/**
 * ShipperMapper
 */
@Repository
public interface ShipperMapper {
    public void addShipper(ShipperDTO shipper);
    public List<ShipperDTO> selectShipper();
    public List<ShipperDTO> selectShipperByword(ShipperDTO shipper);
    public ShipperDTO selectShipperByShipperId(ShipperDTO shipper);
    public void updateShipper(ShipperDTO shipper);
    public void deleteShipper(ShipperDTO shipper);

    
}