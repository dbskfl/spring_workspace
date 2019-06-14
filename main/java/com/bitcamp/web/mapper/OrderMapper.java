package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.OrderDTO;

import org.springframework.stereotype.Repository;

/**
 * OrderMapper
 */
@Repository
public interface OrderMapper {
    public void addOrder(OrderDTO order);
    public List<OrderDTO> selectOrder();
    public List<OrderDTO> selectOrderByword(OrderDTO order);
    public OrderDTO selectOrderByOrderId(OrderDTO order);
    public void updateOrder(OrderDTO order);
    public void deleteOrder(OrderDTO order);

    
}