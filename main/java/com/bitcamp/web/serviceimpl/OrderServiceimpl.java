package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.domain.OrderDTO;
import com.bitcamp.web.service.OrderService;

import org.springframework.stereotype.Service;

/**
 * OrderServiceimpl
 */
@Service
public class OrderServiceimpl implements OrderService {

    @Override
    public void addOrder(OrderDTO order) {

    }

    @Override
    public List<OrderDTO> findOrder() {
        return null;
    }

    @Override
    public List<OrderDTO> findOrderByword(OrderDTO order) {
        return null;
    }

    @Override
    public OrderDTO findOrderByOrderId(OrderDTO order) {
        return null;
    }

    @Override
    public void updateOrder(OrderDTO order) {

    }

    @Override
    public void deleteOrder(OrderDTO order) {

    }

    
}