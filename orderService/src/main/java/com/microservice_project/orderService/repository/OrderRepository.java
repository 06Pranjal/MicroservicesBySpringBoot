package com.microservice_project.orderService.repository;

import com.microservice_project.orderService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
