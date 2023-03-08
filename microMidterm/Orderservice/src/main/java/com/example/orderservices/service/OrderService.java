package com.example.orderservices.service;

import com.example.orderservices.entity.Ordering;

import java.util.List;

public interface OrderService {

    Ordering getOrderById(long orderId);
    List<Ordering> getAllOrder();
    void addOrder(Ordering order);
    void UpdateOrder(long orderId, Ordering order);
    void DeleteOrder(long orderId);
}
