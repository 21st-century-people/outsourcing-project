package com.sparta.outsourcing_project.domain.order.repository;

import com.sparta.outsourcing_project.domain.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByIdAndUserId(Long orderId, Long id);

    List<Order> findAllByUserId(Long userId);

    List<Order> findAllByStoreId(Long id);

    Order findByIdAndStoreId(Long orderId, Long storeId);
}
