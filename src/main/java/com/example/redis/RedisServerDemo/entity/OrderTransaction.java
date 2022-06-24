package com.example.redis.RedisServerDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderTransaction implements Serializable {

    private static final long serialVersionUID = -443911446941799311L;

    @Id
    @GeneratedValue
    private Integer id;
    private String from1;
    private String to1;
    private Double amount;
}
