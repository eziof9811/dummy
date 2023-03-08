package com.example.orderservices.repository;

import com.example.orderservices.entity.Ordering;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Ordering, Long> {
}
