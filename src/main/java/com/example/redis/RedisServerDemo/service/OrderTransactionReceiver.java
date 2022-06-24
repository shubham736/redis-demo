package com.example.redis.RedisServerDemo.service;

import com.example.redis.RedisServerDemo.entity.OrderTransaction;
import com.example.redis.RedisServerDemo.repository.OrderTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

//@Component#
@Service
public class OrderTransactionReceiver {

    @Autowired
    private OrderTransactionRepository transactionRepository;

    @JmsListener(destination = "OrderTransactionQueue", containerFactory = "myFactory")
    public void receiveMessage(OrderTransaction transaction) {
        System.out.println("Received <" + transaction + ">");
        transactionRepository.save(transaction);
    }
}
