package com.example.orderservices.service;

import com.example.orderservices.entity.Ordering;
import com.example.orderservices.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Ordering getOrderById(long orderId){
        return orderRepository.findById(orderId).get();
    }

    @Override
    public List<Ordering> getAllOrder() {
        return (List<Ordering>) orderRepository.findAll();
    }

    public void addOrder(Ordering order){
        orderRepository.save(order);
    }

    @Override
    public void UpdateOrder(long orderId, Ordering order){
        orderRepository.save(order);
    }

    public void DeleteOrder(long orderId){
        orderRepository.deleteById(orderId);
    }
}
