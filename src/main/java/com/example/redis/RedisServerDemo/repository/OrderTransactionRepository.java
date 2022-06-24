package com.example.redis.RedisServerDemo.repository;

import com.example.redis.RedisServerDemo.entity.OrderTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTransactionRepository extends JpaRepository<OrderTransaction, Integer> {
}
