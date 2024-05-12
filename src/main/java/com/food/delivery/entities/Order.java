package com.food.delivery.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@AllArgsConstructor
@Getter
public class Order {

    private Customer customer;
    private Restaurant restaurant;
    private HashMap<String,Integer> food;
}
