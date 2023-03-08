package com.example.orderservices.controller;

import com.example.orderservices.entity.Ordering;
import com.example.orderservices.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Ordering> getAllOrder(){
        return orderService.getAllOrder();
    }

    @GetMapping("/orders/{orderid}")
    public Ordering getOrderById(@PathVariable long orderId){
        return orderService.getOrderById(orderId);
    }

    @PostMapping("/orders/add")
    public ResponseEntity<String> addOrder(@RequestBody Ordering order){
        orderService.addOrder(order);
        return new ResponseEntity<String>("Order Added", HttpStatus.OK);
    }

    @PutMapping("/orders/update/{orderid}")
    public ResponseEntity<String> updateOrder(@PathVariable long orderId, @RequestBody Ordering order){
        orderService.UpdateOrder(orderId, order);
        return new ResponseEntity<String>("Order Updated", HttpStatus.OK);
    }

    @DeleteMapping("/orders/delete/{orderid}")
    public ResponseEntity<String> deleteOrder(@PathVariable long orderId){
        orderService.DeleteOrder(orderId);
        return new ResponseEntity<String>("Order Deleted", HttpStatus.OK);
    }

}
